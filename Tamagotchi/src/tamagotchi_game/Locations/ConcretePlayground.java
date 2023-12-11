package tamagotchi_game.Locations;

import tamagotchi_game.TamagotchiPet;

public class ConcretePlayground extends Playground {
	
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
		// TODO Auto-generated method stub
		
	}
}
