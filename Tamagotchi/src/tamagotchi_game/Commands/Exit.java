package tamagotchi_game.Commands;
import tamagotchi_game.TamagotchiPet;
import tamagotchi_game.Actions.Action;

public class Exit implements Action {
    public Exit(TamagotchiPet pet) {
	}

	@Override
    public void performAction(TamagotchiPet pet) {
        System.exit(0);
    }
}
