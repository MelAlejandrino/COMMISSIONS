package tamagotchi_game;

public abstract class TrainingRoom extends LocationFactory{
	
	public abstract void feedPet(TamagotchiPet pet);
	public abstract void playPet(TamagotchiPet pet);
	public abstract void trainPet(TamagotchiPet pet);
}

class ConcreteTrainingRoom extends TrainingRoom {
	
	@Override
    public void playPet(TamagotchiPet pet) {
        pet.play(pet.getHappinessLevel() + 30);
        System.out.println("You played with your pet in the Playground!");
}

	@Override
	public void feedPet(TamagotchiPet pet) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public void trainPet(TamagotchiPet pet) {
            pet.train(pet.getTrainingLevel() + 20);
            System.out.println("You train your pet in the Training Room!");
    }
}