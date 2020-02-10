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

       view.printWinMassege(View.OUTPUT_WIN_MESSAGE, userSecretNumber, View.OUTPUT_STATISTIC, statArray);
    }

    private int getUserNumber(Scanner scan){

        view.printMessage(View.ENTER_FIRST_NUMBER);
        int userValue = scan.nextInt();

        while(!checkGuess(userValue)){
            if(!checkBounds(userValue)){
                view.printMessage(View.WRONG_INPUT_OUT_OF_BOUNDARIES);
                view.printBounds(model.getValOfBounds());
                statArray.add(userValue);
            }
            else{
                view.printMessage(View.OUTPUT_INFO_ON_BOUNDARIES);


                model.setBoundries(userValue, secretNumber);

                view.printBounds(model.getValOfBounds());
                statArray.add(userValue);
            }

            userValue = scan.nextInt();
        }

        return userValue;
    }

    private boolean checkBounds(int userNumber){
        //if ()

        return model.checkBounds(userNumber);
    }
    private boolean checkGuess(int userNumber){
        return (secretNumber) == userNumber;
    }
}
