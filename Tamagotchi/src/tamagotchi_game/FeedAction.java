package tamagotchi_game;

public class FeedAction implements Action {
    private TamagotchiPet pet;

    public FeedAction(TamagotchiPet pet) {
        this.pet = pet;
    }

    @Override
    public void performAction(TamagotchiPet pet) {
        if (this.pet.getLocation() == Location.KITCHEN) {
            new ConcreteKitchen().feedPet(pet);
        } else if (this.pet.getLocation() == Location.LOBBY) {
        	new ConcreteLobby().feedPet(pet);
        } else {
            System.out.println("Cannot feed in this location!");
            return;
        }
    }
}
