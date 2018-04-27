public class MaxLength {

    public int findMaxLength(int dimension, int numbers[]) {
        int count =0;
        int maxLength = 0;
        for(int i=0; i<dimension; i++) {
            if (numbers[i] > 0)
                count++;
            else
                count = 0;
            if (count > maxLength)
                maxLength = count;
        }
        return maxLength;
    }
}
