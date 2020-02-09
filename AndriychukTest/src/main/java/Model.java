import javafx.util.Pair;

import java.util.Random;

import static java.lang.Math.abs;

public class Model {

    private Pair<Integer, Integer> bounds = new Pair(0,100);

    public int setRandValueOfSecretNumber(int MIN_BOUND,int MAX_BOUND){
        return (int) (Math.random() * (MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND);
    }

    public Pair setBoundries(Pair<Integer, Integer> bound, int newValueOfBound){
        int minValNum = bound.getKey();
        int maxValNum = bound.getValue();
        if (abs(minValNum-newValueOfBound)<abs(maxValNum - newValueOfBound))  minValNum = newValueOfBound;
        else if (abs(minValNum-newValueOfBound)> abs(maxValNum - newValueOfBound))  maxValNum = newValueOfBound;
        else maxValNum = newValueOfBound;

        return bound;
    }


}
