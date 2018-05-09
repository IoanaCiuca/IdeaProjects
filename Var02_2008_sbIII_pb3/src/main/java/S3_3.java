import java.util.ArrayList;
import java.util.Collections;

public class S3_3 {

    public ArrayList<String> sortPositiveNumbers(ArrayList<Integer> inputList) {
        ArrayList<String> resultString = new ArrayList<>();
        ArrayList<Integer> resultInt = new ArrayList<>();
        for(int i=0; i<inputList.size(); i++)
            if(inputList.get(i) > 0)
                resultInt.add(inputList.get(i));

        if(resultInt.isEmpty())
            resultString.add("Nu exista");
        else {
            Collections.sort(resultInt);
            for (int result : resultInt) {
                resultString.add(Integer.toString(result));
            }
        }
        return resultString;
    }
}
