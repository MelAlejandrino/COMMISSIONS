package tamagotchi_game;

public class Train implements Action {
    private TamagotchiPet pet;

	public Train(TamagotchiPet pet) {
		this.pet = pet;
	}
    @Override
    public void performAction(TamagotchiPet pet) {
        if (this.pet.getLocation() == Locations.TRAINING_ROOM) {
        	new ConcreteTrainingRoom().trainPet(pet);
//            this.pet.train(Math.min(100, this.pet.getTrainingLevel() + 20));
//            this.pet.feed(this.pet.getHungerLevel() + 20);
        } else if (this.pet.getLocation() == Locations.LOBBY) {
        	new ConcreteLobby().trainPet(pet);
//            this.pet.train(Math.min(100, this.pet.getTrainingLevel() + 10));
//            this.pet.feed(this.pet.getHungerLevel() + 20);
        } 
        else {
            System.out.println("Cannot train in this location!");
        }
    }
}