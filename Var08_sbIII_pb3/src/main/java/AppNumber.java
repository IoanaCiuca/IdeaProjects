import java.util.ArrayList;
import java.util.HashMap;

public class AppNumber {

    public ArrayList<Integer> convertStringToInt(String givenString) {
        ArrayList<Integer> result=new ArrayList<>();
        int index =0;
        StringBuilder sb = new StringBuilder();

        while (index< givenString.length()) {
            while (index<givenString.length()  && givenString.charAt(index) != ' ' && givenString.charAt(index) != '\r' && givenString.charAt(index) != '\n') {
                sb.append(givenString.charAt(index));
                index++;
            }
            if(sb.length() != 0)
                result.add(Integer.parseInt(sb.toString()));
            sb.delete(0,sb.length());
            index++;
        }
        return result;
    }

    public HashMap<Integer, Integer> countElements(ArrayList<Integer> inputList) {

        HashMap<Integer, Integer> result = new HashMap<>();
        for(int i=0; i<inputList.size() ;i++) {
            if(!result.containsKey(inputList.get(i)))
                result.put(inputList.get(i), 1);
            else {
                int value = result.get(inputList.get(i));
                value++;
                result.put(inputList.get(i), value);
            }
        }

        return result;
    }

}
