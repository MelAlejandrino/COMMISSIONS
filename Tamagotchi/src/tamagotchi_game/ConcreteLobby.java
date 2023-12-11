package tamagotchi_game;

public class ConcreteLobby extends Lobby {
	@Override
    public void feedPet(TamagotchiPet pet) {
            pet.feed(pet.getHungerLevel() - 15);
            System.out.println("You fed your pet in the Lobby!");
    }
	
	@Override
    public void trainPet(TamagotchiPet pet) {
        pet.train(pet.getTrainingLevel() + 10);
        System.out.println("You train your pet in the Lobby!");
    }
	
	@Override
    public void playPet(TamagotchiPet pet) {
        pet.play(pet.getHappinessLevel() + 15);
        System.out.println("You played with your pet in the Lobby!");
}
}
