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

        secretNumber = model.setRandValueOfSecretNumber();
        System.out.println(secretNumber);
        int userSecretNumber = getUserNumber(scanner);

       view.printWinMassege(view.OUTPUT_WIN_MESSAGE, userSecretNumber, View.OUTPUT_STATISTIC, statArray);
    }

    public int getUserNumber(Scanner scan){

        view.printMessage(view.ENTER_FIRST_NUMBER);
        int userValue = scan.nextInt();

        while(!checkGuess(userValue)){
            if(!checkBounds(userValue)){
                view.printMessage(view.WRONG_INPUT_OUT_OF_BOUNDARIES);
                view.printBounds(model.getValOfBounds());
            }
            else{
                view.printMessage(view.OUTPUT_INFO_ON_BOUNDARIES);

                model.setBoundries(userValue);

                view.printBounds(model.getValOfBounds());
                statArray.add(userValue);
            }

            userValue = scan.nextInt();
        }

        return userValue;
    }

    public boolean checkBounds(int userNumber){
        if(!(model.checkBounds(userNumber))) return false;
        else return true;
    }
    public boolean checkGuess(int userNumber){
        if((secretNumber)== userNumber) return true;
        else return false;
    }
}
