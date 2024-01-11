import static org.junit.Assert.*;

import org.junit.Test;

public class MathOperationsTest {
	 @Test
	 //Test la méthode addition qui doit retourner 8 après addition de 3 et 5
	    public void testAddition() {
	        MathOperations mathOperations = new MathOperations();
	        int result = mathOperations.addition(3, 5);
	        assertEquals(8, result);
	    }

	    @Test
	    public void testSubtraction() {
	        MathOperations mathOperations = new MathOperations();
	        int result = mathOperations.subtraction(7, 4);
	        assertEquals(3, result);
	    }

	    @Test
	    public void testMultiplication() {
	        MathOperations mathOperations = new MathOperations();
	        int result = mathOperations.multiplication(2, 6);
	        assertEquals(12, result);
	    }

	    @Test
	    public void testDivision() {
	        MathOperations mathOperations = new MathOperations();
	        double result = mathOperations.division(8, 2);
	        assertEquals(4.0, result, 0.0001); // delta permet une petite marge d'erreur pour les opérations sur les nombres à virgule flottante
	    }

	    @Test(expected = ArithmeticException.class)
	    public void testDivisionByZero() {
	        MathOperations mathOperations = new MathOperations();
	        mathOperations.division(5, 0);
	    }

}
