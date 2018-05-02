import java.util.ArrayList;

public class AppNumber {

    public ArrayList<Integer> convertStringToInt(String givenString) {
        ArrayList<Integer> resultedArray = new ArrayList<>();

        int index = 0;
        //ar trebui sa merg pana la length - 1, dar cum o stiu care e ultimul caracter?
        //Poate fi o cifra a unui numar, doar o cifra sau un spatiu
        while(index<givenString.length()) {
            if(givenString.charAt(index) != ' ' && givenString.charAt(index+1) == ' ') {
                resultedArray.add(Character.getNumericValue(givenString.charAt(index)));
            } else if(givenString.charAt(index) != ' ' && givenString.charAt(index+1) != ' ') {
                String str = "";
                while(index != ' ') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(givenString.charAt(index));
                    str = sb.toString();
                    index++;
                }
                resultedArray.add(Integer.parseInt(str));
            }
            index++;
        }
        return null;
    }

    private void concatenateChars(char a, char b) {

    }
}
