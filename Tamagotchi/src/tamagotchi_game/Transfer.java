package tamagotchi_game;
import java.util.Scanner;


public class Transfer implements Action {
	Scanner scanner = new Scanner(System.in);
    private TamagotchiPet pet;

	public Transfer(TamagotchiPet pet) {
		this.pet = pet;
	}

	@Override
    public void performAction(TamagotchiPet pet) {
        System.out.println("1.) LOBBY \n 2.) KITCHEN \n 3.) PLAYGROUND 4.) TRAINING ROOM");
        System.out.print("Where do you want to transfer your pet? ");
        int transfer_choice = scanner.nextInt();

        
        switch(transfer_choice) {
        case 1:
        	if(this.pet.getLocation() == Locations.LOBBY) {
        		System.out.println("You are already in the Lobby!");
        	} else {
        		this.pet.changeLocation(Locations.LOBBY);
        	}
        	break;
        case 2:
        	if(this.pet.getLocation() == Locations.KITCHEN) {
        		System.out.println("You are already in the Kitchen!");
        	} else {
        		this.pet.changeLocation(Locations.KITCHEN);
        	}
        	break;
        case 3:
        	if(this.pet.getLocation() == Locations.PLAYGROUND) {
        		System.out.println("You are already in the Playground!!");
        	} else {
        		this.pet.changeLocation(Locations.PLAYGROUND);
        	}
        	break;
        case 4:
        	if(this.pet.getLocation() == Locations.TRAINING_ROOM) {
        		System.out.println("You are already in the Training Room!");
        	} else {
        		this.pet.changeLocation(Locations.TRAINING_ROOM);
        	}
        	break;
        default:
        	System.out.println("Location does not exist!");
        	break;
        }
        
    }
}
