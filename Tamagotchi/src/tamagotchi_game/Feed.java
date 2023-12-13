package tamagotchi_game;

public class Feed implements Action {
    private TamagotchiPet pet;

    public Feed(TamagotchiPet pet) {
        this.pet = pet;
    }

    @Override
    public void performAction(TamagotchiPet pet) {
        if (this.pet.getLocation() == Locations.KITCHEN) {
            new ConcreteKitchen().feedPet(pet);
        } else if (this.pet.getLocation() == Locations.LOBBY) {
        	new ConcreteLobby().feedPet(pet);
        } else {
            System.out.println("Cannot feed in this location!");
            return;
        }
    }
}
