import javafx.util.Pair;

import java.util.Random;

import static java.lang.Math.abs;

public class Model {

    private Pair<Integer, Integer> bounds = new Pair(0,100);

    public int setRandValueOfSecretNumber(){
        int MAX_BOUND = bounds.getValue();
        int MIN_BOUND = bounds.getKey();
        return (int) (Math.random() * (MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND);
    }

    public final int setValOfSecretVal(){ return setRandValueOfSecretNumber();}

    public Pair getValOfBounds(){return bounds;}

    public boolean checkBounds(int numberForCheck){
        if(numberForCheck<bounds.getKey()) return false;
        else if (numberForCheck>bounds.getValue()) return false;
        else return true;
    }

    public Pair setBoundries(int newValueOfBound){

        int minValNum = bounds.getKey();
        int maxValNum = bounds.getValue();

        if (abs(minValNum-newValueOfBound)<abs(maxValNum - newValueOfBound))  minValNum = newValueOfBound;
        else if (abs(minValNum-newValueOfBound)> abs(maxValNum - newValueOfBound))  maxValNum = newValueOfBound;
        else maxValNum = newValueOfBound;

        return bounds = new Pair(minValNum,maxValNum);
    }


}
