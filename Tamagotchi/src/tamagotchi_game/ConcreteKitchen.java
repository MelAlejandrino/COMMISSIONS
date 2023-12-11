package tamagotchi_game;

public class ConcreteKitchen extends Kitchen {
    @Override
    public void feedPet(TamagotchiPet pet) {
        pet.feed(pet.getHungerLevel() - 30);
        System.out.println("You fed your pet in the kitchen!");
    }

	@Override
	public void trainPet(TamagotchiPet pet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playPet(TamagotchiPet pet) {
		// TODO Auto-generated method stub
		
	}
}
