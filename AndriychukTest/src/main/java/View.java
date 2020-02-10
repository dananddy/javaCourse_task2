import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class View {
    public static final String ENTER_FIRST_NUMBER = "Hello, User!\nEnter your first guess of number - ";

    public static final String WRONG_INPUT_NOT_NUMBER = "Please, enter number!";
    public static final String WRONG_INPUT_NOT_INTEGER = "Please, enter integer number!";
    public static final String WRONG_INPUT_OUT_OF_BOUNDARIES = "Please, enter number between given range - ";

    public static final String OUTPUT_INFO_ON_BOUNDARIES = "Goog guess. Now you should enter number between:";

    public static final String OUTPUT_WIN_MESSAGE = "YOU GUESSED!!!\n";
    public static final String OUTOUT_LOSE_MESSAGE= "OH, you out of tries. Try again!";

    public static final String OUTPUT_STATISTIC = "Well done!\nHere is your statistics of answers:";



    public void printMessage(String message){System.out.println(message); }
    public void printBounds(Pair Number){System.out.println(Number); }
    public void printWinMassege(String messageWin, int secretNumber, String messageStat, ArrayList statistic){System.out.println(messageWin + secretNumber + messageStat +statistic);}
}
