import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    private int secretNumber;
    private ArrayList statArray = new ArrayList();

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void readUserData(){
        Scanner scanner = new Scanner(System.in);


        model.setBoundries(0);
        model.setValOfSecretVal();
        getUserNumber(scanner);

       view.printWinMassege(view.OUTPUT_WIN_MESSAGE, secretNumber, View.OUTPUT_STATISTIC, userStatList);
    }
    public int getUserNumber(Scanner scan){

        while(checkGuess(scan.nextInt())){
            if(!checkBounds(scan.nextInt())){
                view.printMessage(view.WRONG_INPUT_OUT_OF_BOUNDARIES);
                view.printBounds(model.getValOfBounds());

            }
        }

        return 0;
    }

    public boolean checkBounds(int userNumber){
        statArray.add(userNumber);
        if(!(model.checkBounds(userNumber))) return false;
        else return true;
    }
    public boolean checkGuess(int userNumber){

    }
}
