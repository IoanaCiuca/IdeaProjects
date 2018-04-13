package main;

import java.util.ArrayList;

public class Numbers {
    public int findNumberOfComponents(ArrayList<Integer> list) {
        int numberOfComponents;
        int startIndex = 0;
        int endIndex = list.size()-1;

        while(list.get(startIndex)%10%2 != 0) {
            startIndex++;
        }

        while(list.get(endIndex)%10%2 != 0) {
            endIndex--;
        }

        numberOfComponents = endIndex - startIndex + 1;
        return numberOfComponents;
    }
}
