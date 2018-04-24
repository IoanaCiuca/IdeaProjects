import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleLetterTest {

    @Test
    public void doubleTheLetterFavorableCaseTest() {
        String stringToTest = "alfabetar";
        char characterToTest = 'a';
        String expectedResult = "aalfaabetaar";
        DoubleLetter object = new DoubleLetter();
        String receivedResult = object.doubleTheLetter(stringToTest, characterToTest);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void doubleTheLetterUnFavorableCaseTest1() {
        String stringToTest = "recreere";
        char characterToTest = 'e';
        String expectedResult = "reecreeeeree";
        DoubleLetter object = new DoubleLetter();
        String receivedResult = object.doubleTheLetter(stringToTest, characterToTest);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void doubleTheLetterUnFavorableCaseTest2() {
        String stringToTest = "musca";
        char characterToTest = 'b';
        String expectedResult = "musca";
        DoubleLetter object = new DoubleLetter();
        String receivedResult = object.doubleTheLetter(stringToTest, characterToTest);

        assertEquals(expectedResult, receivedResult);
    }
}
