import cz.cvut.fel.pjv.Lab01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void calculatorTest_plus() {
        Lab01 caluclator = new Lab01();

        int param1 = 1;
        int param2 = 1;

        int expectedValue = 2;

        double result = caluclator.plus(param1, param2);

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void calculatorTest_minus() {
        Lab01 caluclator = new Lab01();

        int param1 = 1;
        int param2 = 4;

        int expectedValue = -3;

        double result = caluclator.minus(param1, param2);

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void calculatorTest_multiplication() {
        Lab01 caluclator = new Lab01();

        int param1 = 7;
        int param2 = 8;

        int expectedValue = 56;

        double result = caluclator.multiplication(param1, param2);

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void calculatorTest_division() throws Exception {
        Lab01 caluclator = new Lab01();

        int param1 = 10;
        int param2 = 5;

        int expectedValue = 2;

        double result = caluclator.division(param1, param2);

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void calculatorTest_division_zero() {
        Lab01 caluclator = new Lab01();

        int param1 = 10;
        int param2 = 0;

        Exception exception = Assertions.assertThrows(Exception.class, () -> caluclator.division(param1, param2));

        String expectedMessage = "Pokus o deleni nulou";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

}
