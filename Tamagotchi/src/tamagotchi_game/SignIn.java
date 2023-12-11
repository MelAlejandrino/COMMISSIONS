package tamagotchi_game;
import java.util.Scanner;

public class SignIn {
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
