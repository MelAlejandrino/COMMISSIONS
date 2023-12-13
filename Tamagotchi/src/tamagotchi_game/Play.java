package tamagotchi_game;


public class Play implements Action {
    private TamagotchiPet pet;

	public Play(TamagotchiPet pet) {
		this.pet = pet;
	}
    @Override
    public void performAction(TamagotchiPet pet) {
        if (this.pet.getLocation() == Locations.PLAYGROUND) {
        	new ConcretePlayground().playPet(pet);
//            this.pet.play(Math.max(0, this.pet.getHappinessLevel() + 30));
//            this.pet.feed(this.pet.getHungerLevel() + 30);
        } else if (this.pet.getLocation() == Locations.LOBBY) {
        	new ConcreteLobby().playPet(pet);
//            this.pet.play(Math.max(0, this.pet.getHappinessLevel() + 15));
//            this.pet.feed(this.pet.getHungerLevel() + 15);
        } 
        else {
            System.out.println("Cannot play in this location!");
        }
    }
}

