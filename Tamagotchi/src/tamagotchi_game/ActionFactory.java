package tamagotchi_game;

public class ActionFactory {
    public static Action getAction(String action, TamagotchiPet pet) {
        switch (action) {
            case "feed":
                return new FeedAction(pet);
            case "play":
                return new PlayAction(pet);
            case "train":
                return new TrainAction(pet);
            case "disp":
            	return new DisplayStatus(pet);
            case "transfer":
            	return new Transfer(pet);
            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }
    }
}

