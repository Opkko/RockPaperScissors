package Ui;

import Player.Player;

public class Ui {



    /**
     * Prints logo
     */
    public static void logoMessage(){
        System.out.println(
                "______           _     ______                       _____      _                        \n" +
                        "| ___ \\         | |    | ___ \\                     /  ___|    (_)                       \n" +
                        "| |_/ /___   ___| | __ | |_/ /_ _ _ __   ___ _ __  \\ `--.  ___ _ ___ ___  ___  _ __ ___ \n" +
                        "|    // _ \\ / __| |/ / |  __/ _` | '_ \\ / _ \\ '__|  `--. \\/ __| / __/ __|/ _ \\| '__/ __|\n" +
                        "| |\\ \\ (_) | (__|   <  | | | (_| | |_) |  __/ |    /\\__/ / (__| \\__ \\__ \\ (_) | |  \\__ \\\n" +
                        "\\_| \\_\\___/ \\___|_|\\_\\ \\_|  \\__,_| .__/ \\___|_|    \\____/ \\___|_|___/___/\\___/|_|  |___/\n" +
                        "                                 | |                                                    \n" +
                        "                                 |_|                                                    "
        );
    }

    /**
     * Prints Player Name
     */
    public static void getPlayerName(){
        System.out.println("Please Enter your Name: ");
    }

    /**
     * Prints Mode Selection Message
     */
    public static void getPlayerGameMode(){
        System.out.println("Select Choice of Opponent: \n 1.Player vs Computer \n 2.Computer vs Computer ");
    }

    /**
     * Welcome Message for The game
     */
    public static void welcomeMsg(Player player){
        System.out.printf("Welcome to RPS v1, %s, game mode is, player.getMode()");
        System.out.println();
        switch (player.getMode()){
            case "1":
                System.out.printf("Welcome to RPS v1, %s, game mode is, Player vs Computer");
//                System.out.println("Player Name is : " + player.getPlayerName());
                break;
            case "2":
                System.out.printf("Welcome to RPS v1, %s, game mode is, Computer vs Computer");
                break;
            default:
                System.out.println("There must be a System Error");
        }
    }

    /**
     * Game guide based on mode.
     * @param mode
     */
    public static void gameGuide(String mode){
        System.out.println("To choose ROCK, type 0\nTo choose PAPER, type 1\nTo choose SCISSORS, type 2\n");
        if(mode.equals("1")){
            System.out.println("Player 1, Please choose 0, 1 or 2: ");
        }
        else if(mode.equals("2")){
            System.out.println("Computer 1 is choosing...");
        }
    }

    /**
     * Play again message
     */
    public static void playAgainMsg(){
        System.out.println("\nDo you want to play again?\nPlease type Y for YES or any other key for NO.");
    }

    /**
     * Generate human choices UI Text.
     * @param firstChoice, secondChoice, mode
     * @param mode
     */
    public static void generateWinnerMsg(int firstChoice, int secondChoice, String mode){


        switch (mode){
            case "1":
                switch (firstChoice){
                    case 0:
                        System.out.println("Player chose ROCK.");
                        if (secondChoice == 0) {
                            System.out.println("Computer chose ROCK.");
                            System.out.println("Its a TIE!");
                        } else if (secondChoice == 1) {
                            System.out.println("Computer chose PAPER.");
                            System.out.println("Computer WINS!");
                        } else if (secondChoice == 2) {
                            System.out.println("Computer chose SCISSORS.");
                            System.out.println("You WIN!");
                        }
                        break;
                    case 1:
                        System.out.println("Player chose PAPER.");
                        if (secondChoice == 0) {
                            System.out.println("Computer chose ROCK.");
                            System.out.println("You WIN!");
                        } else if (secondChoice == 1) {
                            System.out.println("Computer chose PAPER.");
                            System.out.println("Its a TIE!");
                        } else if (secondChoice == 2) {
                            System.out.println("Computer chose SCISSORS.");
                            System.out.println("Computer WINS!");
                        }
                        break;
                    case 2:
                        System.out.println("Player chose SCISSORS.");
                        if (secondChoice == 0) {
                            System.out.println("Computer chose ROCK.");
                            System.out.println("Computer WINS!");

                        } else if (secondChoice == 1) {
                            System.out.println("Computer chose PAPER.");
                            System.out.println("You WIN!");
                        } else if (secondChoice == 2) {
                            System.out.println("Computer chose SCISSORS.");
                            System.out.println("Its a TIE!");
                        }
                        break;
                    default:
                        System.out.println("Please chose a valid Option, 0, 1 or 2");
                        break;
                }
                break;
            case "2":
                switch (firstChoice){
                    case 0:
                        System.out.println("Computer Player 1 chose ROCK.");
                        if (secondChoice == 0) {
                            System.out.println("Computer Player 2 chose ROCK.");
                            System.out.println("Its a TIE!");
                        } else if (secondChoice == 1) {
                            System.out.println("Computer Player 2 chose PAPER.");
                            System.out.println("Computer Player 2 WINS!");
                        } else if (secondChoice == 2) {
                            System.out.println("Computer Player 2 SCISSORS.");
                            System.out.println("Computer Player 1 WINS!");
                        }
                        break;
                    case 1:
                        System.out.println("Computer Player 1 chose PAPER.");
                        if (secondChoice == 0) {
                            System.out.println("Computer Player 2 chose ROCK.");
                            System.out.println("Computer Player 1 WINS!");
                        } else if (secondChoice == 1) {
                            System.out.println("Computer Player 2 chose PAPER.");
                            System.out.println("Its a TIE!");
                        } else if (secondChoice == 2) {
                            System.out.println("Computer Player 2 SCISSORS.");
                            System.out.println("Computer Player 2 WINS!");
                        }
                        break;
                    case 2:
                        System.out.println("Computer Player 1 chose SCISSORS.");
                        if (secondChoice == 0) {
                            System.out.println("Computer Player 2 chose ROCK.");
                            System.out.println("Computer Player 2 WINS!");
                        } else if (secondChoice == 1) {
                            System.out.println("Computer Player 2 chose PAPER.");
                            System.out.println("Computer Player 1 WINS!");
                        } else if (secondChoice == 2) {
                            System.out.println("Computer Player 2 SCISSORS.");
                            System.out.println("Its a TIE!");
                        }
                        break;
                }
                break;
        }
    }



}
