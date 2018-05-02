public class ProcessString {

    public String findResult(String inputString) {
        int suma = Character.getNumericValue(inputString.charAt(0));
        int index = 1;
        while(inputString.charAt(index) != '=') {
            if(inputString.charAt(index) == '+')
                suma += Character.getNumericValue(inputString.charAt(index+1));
            else
                suma -= Character.getNumericValue(inputString.charAt(index+1));
            index+=2;
        }
        return inputString + suma;
    }
}
