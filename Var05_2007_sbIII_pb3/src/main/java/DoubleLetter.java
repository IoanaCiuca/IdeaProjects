public class DoubleLetter {

    public String doubleTheLetter(String givenString, char givenCharacter) {
        StringBuilder givenStringBuilder = new StringBuilder(givenString);
        for(int i=0; i<givenStringBuilder.length(); i++) {
            if(givenStringBuilder.charAt(i) == givenCharacter) {
                givenStringBuilder.insert(i,givenCharacter);
                i++;
            }
        }
        String resultedString = new String(givenStringBuilder);
        return resultedString;
    }
}
