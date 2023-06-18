package ca.sheridancollege.project;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        scanner = new Scanner(System.in);
    }

    @Override
    public void play() {
        // The human player's turn logic
        // Implement the specific gameplay actions for the human player
    }

    public Rank selectRank() {
        System.out.print("Enter the rank to ask for: ");
        String input = scanner.nextLine().toUpperCase();
        return Rank.valueOf(input);
    }
}