package tamagotchi_game.Locations;

import tamagotchi_game.TamagotchiPet;

public abstract class LocationAction {

    public abstract void feedPet(TamagotchiPet pet);
    public abstract void trainPet(TamagotchiPet pet);
    public abstract void playPet(TamagotchiPet pet);
}
