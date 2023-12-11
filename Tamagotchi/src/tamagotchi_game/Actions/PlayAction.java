package tamagotchi_game.Actions;

import tamagotchi_game.TamagotchiPet;
import tamagotchi_game.Locations.ConcreteLobby;
import tamagotchi_game.Locations.ConcretePlayground;
import tamagotchi_game.Locations.Location;

public class PlayAction implements Action {
    private TamagotchiPet pet;

	public PlayAction(TamagotchiPet pet) {
		this.pet = pet;
	}
    @Override
    public void performAction(TamagotchiPet pet) {
        if (this.pet.getLocation() == Location.PLAYGROUND) {
        	new ConcretePlayground().playPet(pet);
//            this.pet.play(Math.max(0, this.pet.getHappinessLevel() + 30));
//            this.pet.feed(this.pet.getHungerLevel() + 30);
        } else if (this.pet.getLocation() == Location.LOBBY) {
        	new ConcreteLobby().playPet(pet);
//            this.pet.play(Math.max(0, this.pet.getHappinessLevel() + 15));
//            this.pet.feed(this.pet.getHungerLevel() + 15);
        } 
        else {
            System.out.println("Cannot play in this location!");
        }
    }
}

