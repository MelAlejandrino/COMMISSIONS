package tamagotchi_game.Locations;

import tamagotchi_game.TamagotchiPet;

public abstract class TrainingRoom extends LocationAction{
	
	public abstract void feedPet(TamagotchiPet pet);
	public abstract void playPet(TamagotchiPet pet);
	public abstract void trainPet(TamagotchiPet pet);
}
