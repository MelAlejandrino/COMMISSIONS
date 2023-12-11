package tamagotchi_game.Commands;
import tamagotchi_game.TamagotchiPet;
import tamagotchi_game.Actions.Action;

public class DisplayStatus implements Action {
    private TamagotchiPet pet;

	public DisplayStatus(TamagotchiPet pet) {
		this.pet = pet;
	}

	@Override
    public void performAction(TamagotchiPet pet) {
        this.pet.displayStatus();
    }
}
