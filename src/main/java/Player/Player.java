package Player;

/**
 * Class for players but in the feature for Scalability can be renamed
 */
public class Player {

    private static String playerName;
    private static String mode;

    public Player() {
    }

    /**
     * Getter
     * @return
     */
    public static String getPlayerName() {
        return playerName;
    }

    public static String getMode() {
        return mode;
    }

    /**
     * Setters
     * @param playerName
     */
    public static void setPlayerName(String playerName) {
        Player.playerName = playerName;
    }

    /**
     * Setters
     * Set Player Mode Choice
     * @param mode
     */
    public static void setMode(String mode) {
        Player.mode = mode;
    }



}
