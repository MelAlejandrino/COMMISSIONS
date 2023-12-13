package tamagotchi_game;
import java.util.Scanner;

public class TamagotchiGame {

    public static void Interface(Scanner scanner, TamagotchiPet pet) {
    	boolean exit = false;

        while (!exit) {
            System.out.println("=================\n===== " + pet.getLocation() + " =====\n=================");
            // Prompts
            System.out.println("Perform an action and take care of your pet!");
            System.out.println("1.) Feed");
            System.out.println("2.) Play");
            System.out.println("3.) Train");
            System.out.println("4.) Display Status");
            System.out.println("5.) Transfer");
            System.out.println("6.) Exit");

            System.out.print("Enter your choice: ");
            int user_choice = scanner.nextInt();
            System.out.println("");
            switch (user_choice) {
                case 1:
                    Action feedAction = ActionFactory.getAction("feed", pet);
                    feedAction.performAction(pet);
                    System.out.println("");
                    break;
                case 2:
                	Action playAction = ActionFactory.getAction("play", pet);
                    playAction.performAction(pet);
                    System.out.println("");
                    break;
                case 3:
                	Action trainAction = ActionFactory.getAction("train", pet);
                    trainAction.performAction(pet);
                    System.out.println("");
                    break;
                case 4:
                    Action displayStatusAction = ActionFactory.getAction("disp", pet);
                    displayStatusAction.performAction(pet);
                    System.out.println("");
                    break;
                case 5:
                	Action transferAction = ActionFactory.getAction("transfer", pet);
                    transferAction.performAction(pet);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.print("Choose from 1-6");
                    break;
            }
        }
    }

    public static void main(String[] args) {
    	TamagotchiPet pet = TamagotchiPet.getInstance();
        Scanner scanner = new Scanner(System.in);
        SignIn.signInProcess(scanner);
        
        String user_name = SignIn.getUserName();
        String pet_name = SignIn.getPetName();
        
        System.out.println("Hello! " + user_name + ", Let's take care of your Tamagotchi " +  pet_name);

        Interface(scanner, pet);
        scanner.close();
    }
    
    
    
    public static class ActionFactory {
        public static Action getAction(String action, TamagotchiPet pet) {
            switch (action) {
                case "feed":
                    return new Feed(pet);
                case "play":
                    return new Play(pet);
                case "train":
                    return new Train(pet);
                case "disp":
                	return new DisplayStatus(pet);
                case "transfer":
                	return new Transfer(pet);
                default:
                    throw new IllegalArgumentException("Invalid action: " + action);
            }
        }
    }
    
    
}

interface Action {
    void performAction(TamagotchiPet pet);
}

class DisplayStatus implements Action {
    private TamagotchiPet pet;

	public DisplayStatus(TamagotchiPet pet) {
		this.pet = pet;
	}

	@Override
    public void performAction(TamagotchiPet pet) {
        this.pet.displayStatus();
    }
}

class Exit implements Action {
    public Exit(TamagotchiPet pet) {
	}

	@Override
    public void performAction(TamagotchiPet pet) {
        System.exit(0);
    }
}

class SignIn {
	private static String user_name;
	private static String pet_name;

	public static void signInProcess(Scanner scanner) {
        System.out.println("=================================\n===== WELCOME TO TAMAGOTCHI =====\n=================================");
        System.out.print("Enter your name: ");
        user_name = scanner.nextLine();

        System.out.print("How about your virtual pet's name? ");
        pet_name = scanner.nextLine();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static String getUserName() {
    	return user_name;
    }
    
    public static String getPetName() {
    	return pet_name;
    }
}
