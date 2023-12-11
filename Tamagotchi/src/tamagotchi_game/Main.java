package tamagotchi_game;
import java.util.Scanner;

import tamagotchi_game.Actions.Action;
import tamagotchi_game.Actions.ActionFactory;

public class Main {

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
}
