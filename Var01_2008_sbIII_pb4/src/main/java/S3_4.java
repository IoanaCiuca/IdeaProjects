import java.util.ArrayList;

public class S3_4 {

    public Integer sub(ArrayList<Integer> inputList, int a) {
        int counter = 0;
        for(int i=0; i<inputList.size(); i++)
            if(inputList.get(i)<a)
                counter++;
        return counter;
    }
}
