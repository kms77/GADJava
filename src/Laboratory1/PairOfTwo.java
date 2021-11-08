package Laboratory1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairOfTwo {
    private final List<Integer> array;

    public PairOfTwo(List<Integer> array) {

        this.array = array;
    }

    public List<Integer> getArray() {
        return array;
    }

    public Integer findNumberOfPairs(){
        List<Integer> copyArray= new ArrayList<>(this.array);
        Collections.sort(copyArray);

        Integer lowBound = 0;
        Integer upperBound = copyArray.size() - 1;
        Integer countPairs = 0;

        while(lowBound < upperBound){
            if(copyArray.get(lowBound) + copyArray.get(upperBound)== 0){
                countPairs++;
                copyArray.remove(lowBound);
                copyArray.remove(upperBound);
                upperBound-=2;
            }

            if(copyArray.get(lowBound)+copyArray.get(upperBound) > 0){
                upperBound--;
            }
            else{
                lowBound++;
            }
        }
        return countPairs;
    }

    @Override
    public String toString(){
        return this.array.toString();
    }

}
