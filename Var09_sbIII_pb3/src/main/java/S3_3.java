import java.util.ArrayList;

public class S3_3 {

    public Integer ridge(ArrayList<Integer> givenList) {
        int max = 0;
        int poz = -1;
        int lastElement = givenList.get(givenList.size() - 1);
        boolean okLeft = true;
        boolean okRight = true;
        for (int i = 0; i < givenList.size(); i++) {
            if (givenList.get(i) > max) {
                max = givenList.get(i);
                poz = i;
            }
        }
        for (int i = 0; i < poz; i++)
            if (givenList.get(i) > givenList.get(i + 1))
                return 0;
        for (int i = poz; i < givenList.size() - 1; i++)
            if (givenList.get(i) < givenList.get(i + 1))
                return 0;
        return max;
    }
}
