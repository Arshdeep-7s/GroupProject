package ca.sheridancollege.project;
/**
 * @author Arshdeep Singh
 */
import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scanner;
    public boolean endgame = false;

    public HumanPlayer(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    @Override
    public void play() {
        // The human player's turn logic
        // Implement the specific gameplay actions for the human player
    }

    public String selectRank() {
        System.out.print("Enter the rank to ask for(or enter -1 to exit): ");
        String input = scanner.nextLine().toUpperCase();
        //if(Integer.parseInt(input) == -1){
          //  endgame = true;

        //}
        return input;
    }
}