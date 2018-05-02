public class DifferentDigits {

    public int verifyNumbers(int a, int b) {
        int result=0;
        SubMethod subMethod = new SubMethod();
        int digitExistsInA;
        int digitExistsInB;
        for(int i=0; i<9; i++) {
            digitExistsInA = subMethod.sub(a,i);
            digitExistsInB = subMethod.sub(b,i);
            if(!(digitExistsInA == a) && !(digitExistsInB == b))
                result++;
        }

        return result;
    }
}
