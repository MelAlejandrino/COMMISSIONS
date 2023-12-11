package tamagotchi_game;

public class TrainAction implements Action {
    private TamagotchiPet pet;

	public TrainAction(TamagotchiPet pet) {
		this.pet = pet;
	}
    @Override
    public void performAction(TamagotchiPet pet) {
        if (this.pet.getLocation() == Location.TRAINING_ROOM) {
        	new ConcreteTrainingRoom().trainPet(pet);
//            this.pet.train(Math.min(100, this.pet.getTrainingLevel() + 20));
//            this.pet.feed(this.pet.getHungerLevel() + 20);
        } else if (this.pet.getLocation() == Location.LOBBY) {
        	new ConcreteLobby().trainPet(pet);
//            this.pet.train(Math.min(100, this.pet.getTrainingLevel() + 10));
//            this.pet.feed(this.pet.getHungerLevel() + 20);
        } 
        else {
            System.out.println("Cannot train in this location!");
        }
    }
}