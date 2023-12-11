package tamagotchi_game;

public class Exit implements Action {
    public Exit(TamagotchiPet pet) {
	}

	@Override
    public void performAction(TamagotchiPet pet) {
        System.exit(0);
    }
}
