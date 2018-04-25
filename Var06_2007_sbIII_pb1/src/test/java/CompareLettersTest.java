import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareLettersTest {
    @Test
    public void testContainsSameLetters() {
        String s1 = "baraca";
        String s2 = "abracadabra";
        String expectedResult = "Da";
        CompareLetters compareLetters = new CompareLetters();
        String receivedResult = compareLetters.containsSameLetter(s1,s2);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testContainsSameLettersUnfavorableCase1() {
        String s1 = "baraca";
        String s2 = "dinte";
        String expectedResult = "Nu";
        CompareLetters compareLetters = new CompareLetters();
        String receivedResult = compareLetters.containsSameLetter(s1,s2);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testContainsSameLettersUnfavorableCase2() {
        String s1 = "brisca";
        String s2 = "baraca";
        String expectedResult = "Nu";
        CompareLetters compareLetters = new CompareLetters();
        String receivedResult = compareLetters.containsSameLetter(s1,s2);

        assertEquals(expectedResult, receivedResult);
    }
}
