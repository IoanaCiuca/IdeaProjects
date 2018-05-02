import java.math.BigDecimal;

public class SumaZecClass {

    public Integer sumazec(int a, int n) {
        int s =0;
        float invert = (float)1/a;
        String invertWithNDigits = String.format ("%,." + n + "f", invert);
        invertWithNDigits = invertWithNDigits.substring(invertWithNDigits.indexOf(".")).substring(1);

        for(int i=0; i<invertWithNDigits.length(); i++) {
            s += Character.getNumericValue(invertWithNDigits.charAt(i));
        }
        return s;
    }
}
