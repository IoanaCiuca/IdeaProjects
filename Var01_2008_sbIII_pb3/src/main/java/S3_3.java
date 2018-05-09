import java.util.ArrayList;

public class S3_3 {

    public ArrayList<String> findDivisibleNumbers(int n, ArrayList<Integer> inputList) {
        ArrayList<Integer> resultInt = new ArrayList<>();
        for(int i=0; i<inputList.size(); i++) {
            if(inputList.get(i)%n == 0 )
                resultInt.add(inputList.get(i));
        }

        ArrayList<String> resultString = new ArrayList<>();
        if(resultInt.isEmpty()) {
            resultString.add("Nu exista");
        }
        else {
            for (int result : resultInt) {
                resultString.add(Integer.toString(result));
            }
        }
        return resultString;
    }
}
