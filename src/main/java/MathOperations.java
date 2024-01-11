
public class MathOperations {
	 public int addition(int a, int b) {
	        return a + b;
	    }

	    public int subtraction(int a, int b) {
	        return a - b;
	    }

	    public int multiplication(int a, int b) {
	        return a * b;
	    }

	    public double division(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero is undefined");
	        }
	        return (double) a / b;
	    }
}
