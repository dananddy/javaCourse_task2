import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    private int secretNumber;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void readUserData(){
        Scanner scanner = new Scanner(System.in);

        /*
        model.setBoundries();
        model.setSecretValue();
        model.getUserNumber();
        */
       // view.printWinMassege(view.OUTPUT_WIN_MESSAGE, secretNumber, View.OUTPUT_STATISTIC, userStatList);
    }


    public ArrayList inputUserNumbers(int minNumber, int maxNumber, Scanner scanNumber){
        ArrayList statArray = new ArrayList();

        return statArray;
    }
}
