import java.util.ArrayList;

public class S3_3 {
    public ArrayList<Integer> getMaxim(ArrayList<Integer> inputList) {
        ArrayList<Integer> result = new ArrayList<>();
        int max1 = inputList.get(1);
        int max2 = inputList.get(2);

        for(int i=0; i<inputList.size(); i++) {
            if (inputList.get(i) > max1 && inputList.get(i) != max2)
                max1 = inputList.get(i);
            if(inputList.get(i) > max2 && inputList.get(i) != max1)
                max2 = inputList.get(i);
        }

        result.add(max1);
        result.add(max2);
        return result;
    }

}
