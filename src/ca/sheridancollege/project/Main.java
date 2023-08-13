package ca.sheridancollege.project;
/**
 * 
 * @author Arshdeep Singh
 */

public class Main {
    public static void main(String[] args) {
        GoFishGame game = new GoFishGame();
        game.getPlayers().add(new HumanPlayer("Player 1"));
        game.getPlayers().add(new HumanPlayer("Player 2"));
        game.play();
        game.declareWinner();
    }
}