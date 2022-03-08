import Exceptions.RockPaperScissorsEmptyException;
import Exceptions.RockPaperScissorsInvalidTypeException;
import Player.Player;
import Ui.Ui;

import java.util.Scanner;

public class RockPaperScissors {

    static String in;
    static Scanner modeInput = new Scanner(System.in); // for gameMode.

    /**
     * Main
     */
    public static void main(String args[]) throws RockPaperScissorsEmptyException, RockPaperScissorsInvalidTypeException {

        //Class Objects
        Player player = new Player(); // Generate new Player
        Game game = new Game(); // Create new Game


        // Allow Game to Continue Unless User chooses to exit.
        while(true){
            // Start Game Process
            game.start(modeInput);
            // Read user input

            Scanner input = new Scanner(System.in);

            Ui.getPlayerGameMode();
            String mode = input.nextLine();

            player.setMode(mode);
            //Ui.welcomeMsg(player);// error here
            game.runGame(input, mode);
            if(!game.playAgain(input)){
                break;
            }
        }
    }
}
