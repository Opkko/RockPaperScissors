import java.util.Random;
import java.util.Scanner;

import Exceptions.RockPaperScissorsEmptyException;
import Exceptions.RockPaperScissorsInvalidTypeException;
import Ui.*;


public class Game {
    static Scanner input = new Scanner(System.in);

    public static void start(Scanner input){
        Ui.logoMessage();
    }

    /**
     * To generate random computer choices
     * @return
     */
    public static int comChoice(){
        Random comPlayer = new Random();
        int comChoice = comPlayer.nextInt(3); // Generate random number from 0-2
        return comChoice;
    }

    /**
     * Run game with mode selection
     * @param input
     * @param mode
     */
    public void runGame(Scanner input, String mode) throws RockPaperScissorsEmptyException, RockPaperScissorsInvalidTypeException {

        //Print game guide
        Ui.gameGuide(mode);
        String selection = input.nextLine(); // Player / Computer's selection.
        // Check if it is player vs com or com vs player
        if(mode.equals("1")){
            try {
                if(selection.equals(null) || selection.equals("")){
                    System.out.println("     ☹ OOPS!!! The choice cannot be cannot be empty.\nGame will now Exit!");
                    throw new RockPaperScissorsEmptyException("");
                }
                else if(!selection.equals("0") && !selection.equals("1") && !selection.equals("2")){
                    throw new RockPaperScissorsInvalidTypeException("     ☹ OOPS!!! The choice must be 0-2");
                }
                int choice = Integer.parseInt(selection);
                if(choice==0){
                    Ui.generateWinnerMsg(choice, comChoice(), mode);
                }
                else if(choice==1){
                    Ui.generateWinnerMsg(choice, comChoice(), mode);
                }
                else if(choice==2){
                    Ui.generateWinnerMsg(choice, comChoice(), mode);
                }

            }
            catch (Exception e){
                System.out.println("Game error, game will now Exit!");

            }
        }

        // Computer vs Computer
        else if(mode.equals("2")){
            try{
                int comPlayer1 = comChoice(); // Generate random Computer Player 1 choice
                if(comPlayer1 == 0){
                    Ui.generateWinnerMsg(comPlayer1, comChoice(), mode);
                }
                else if(comPlayer1 == 1){
                    Ui.generateWinnerMsg(comPlayer1, comChoice(), mode);
                }
                else if(comPlayer1 == 2){
                    Ui.generateWinnerMsg(comPlayer1, comChoice(), mode);
                }
            }
            catch (Exception e){
                System.out.println("Game error, game will now Exit!");
            }
        }
        else {
            throw new RockPaperScissorsInvalidTypeException("");
        }


    }

    /**
     * Asks if User wants to replay.
     * @param input
     * @return
     */
    public boolean playAgain(Scanner input){
        Ui.playAgainMsg();
        String res = input.nextLine();
        return res.equalsIgnoreCase("y");
    }

}
