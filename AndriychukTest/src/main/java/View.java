import java.util.ArrayList;
import java.util.List;

public class View {
    private static final String ENTER_FIRST_NUMBER = "Hello, User!\nEnter your first guess of number - ";

    private static final String WRONG_INPUT_NOT_NUMBER = "Please, enter number!";
    private static final String WRONG_INPUT_NOT_INTEGER = "Please, enter integer number!";
    private static final String WRONG_INPUT_OUT_OF_BOUNDARIES = "Please, enter number between given range - ";

    private static final String OUTPUT_WIN_MESSAGE = "YOU GUESSED!!!\n";
    private static final String OUTOUT_LOSE_MESSAGE= "OH, you out of tries. Try again!";

    private static final String OUTPUT_STATISTIC = "Well done!\nHere is your statistics of answers:";

    private void printMessage(String message){System.out.println(message); }
    private void printWinMassege(String messageWin, int secretNumber, String messageStat, ArrayList statistic){System.out.println(messageWin + secretNumber + messageStat +statistic);}
}
