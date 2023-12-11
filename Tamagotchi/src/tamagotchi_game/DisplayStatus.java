package tamagotchi_game;

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
