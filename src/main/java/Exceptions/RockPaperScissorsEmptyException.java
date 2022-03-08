package Exceptions;

public class RockPaperScissorsEmptyException extends RockPaperScissorsException{
    public RockPaperScissorsEmptyException(String input){
        super("     ☹ OOPS!!! The choice cannot be cannot be empty.");
    }
}
