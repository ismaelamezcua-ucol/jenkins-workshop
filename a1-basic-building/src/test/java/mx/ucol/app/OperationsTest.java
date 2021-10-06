package mx.ucol.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperationsTest {
    /**
     * Should return the correct addition of two numbers
     */
    @Test
    public void additionTest() {
        Operations operationsMock = new Operations();
    
        int firstNumber = 5;
        int secondNumber = 10;

        assertEquals(15, operationsMock.addition(firstNumber, secondNumber));
    }

    /**
     * Should return the correct substraction of two numbers.
     */
    @Test
    public void substractionTest() {
        Operations operationsMock = new Operations();
        int firstNumber = 10;
        int secondNumber = 5;

        assertEquals(5, operationsMock.substraction(firstNumber, secondNumber));
    }

    /**
     * Should return the correct multiplication of two numbers
     */
    @Test
    public void multiplicationTest() {
        Operations opMock = new Operations();
        int firstNumber = 5;
        int secondNumber = 10;

        assertEquals(50, opMock.multiplication(firstNumber, secondNumber));
    }
}
