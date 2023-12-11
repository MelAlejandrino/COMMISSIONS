package tamagotchi_game;

import tamagotchi_game.Locations.Location;

public class TamagotchiPet {
	private static TamagotchiPet instance;
	
	private int hungerLevel;
	private int happinessLevel;
	private int trainingLevel;
	private Location location;

	private TamagotchiPet() {
		hungerLevel = 50;
		happinessLevel = 100;
		trainingLevel = 20;
		
		location = Location.LOBBY;
	}
	
	public static TamagotchiPet getInstance() {
		if (instance == null) {
			instance = new TamagotchiPet();
		}
		
		return instance;
	}
	
	public void feed(int newHungerLevel) {
	    if (newHungerLevel < 0) {
	    	newHungerLevel = 0;
	    	hungerLevel = newHungerLevel;
	    } else if(newHungerLevel > 100) {
	    	newHungerLevel = 100;
	    	hungerLevel = newHungerLevel;
	    } else {
	    	hungerLevel = newHungerLevel;
	    }
	}

	
	public void play(int newHappinessLevel) {
	    if (newHappinessLevel < 0) {
	    	newHappinessLevel = 0;
	    	happinessLevel = newHappinessLevel;
	    } else if( newHappinessLevel > 100) {
	    	newHappinessLevel = 100;
	    	happinessLevel = newHappinessLevel;
	    } else {
			happinessLevel = newHappinessLevel;
	    }
	    hungerLevel = hungerLevel + 20;
	    if (hungerLevel > 90) {
	    	happinessLevel -= 20;
	    }
	    if (hungerLevel > 100) {
	    	hungerLevel = 100;
	    }
	}
	
	public void train(int newTrainingLevel) {
	    if (newTrainingLevel < 0) {
	    	newTrainingLevel = 0;
	    	trainingLevel = newTrainingLevel;
	    } else if(newTrainingLevel > 100) {
	    	newTrainingLevel = 100;
	    	trainingLevel = newTrainingLevel;
	    }else {
			trainingLevel = newTrainingLevel;
	    }
	    hungerLevel += 30;
	    if (hungerLevel > 90) {
	    	happinessLevel -= 20;
	    }
	    if (hungerLevel > 100) {
	    	hungerLevel = 100;
	    }
	}
	
	public void changeLocation(Location location) {
        this.location = location;
    }
	
	public int getHungerLevel() {
		return hungerLevel;
	}
	
	public int getHappinessLevel() {
		return happinessLevel;
	}
	
	public int getTrainingLevel() {
		return trainingLevel;
	}
	
	public Location getLocation() {
		return location;
	}
	
    public void displayStatus() {
        System.out.println("Hunger Level: " + hungerLevel);
        System.out.println("Happiness Level: " + happinessLevel);
        System.out.println("Training Level: " + trainingLevel);
        System.out.println("Location: " + location);
    }
}
