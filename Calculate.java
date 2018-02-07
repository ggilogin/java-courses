import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");

		try {

			final double first = Integer.valueOf(arg[0]);
			final char operation = arg[1].charAt(0);
			final double second = Integer.valueOf(arg[2]);
			final NumberFormat nf = new DecimalFormat("#.###############");
			final String result;

			if ('+' == operation) {
				result = "Result = " + nf.format(first + second);
			} else if ('-' == operation) {
				result = "Result = " + nf.format(first - second);
			} else if ('*' == operation) {
				result = "Result = " + nf.format(first * second);
			} else if ('/' == operation) {
				result = "Result = " + nf.format(first/second);
			} else if ('^' == operation) {
				result = "Result = " + nf.format(Math.pow(first,second));
			}
			else {
				result = String.format("The undefined operation \"%s\". Please, use: +,-, *, / or ^ .",operation);
			}
			System.out.println("Result = " + result);

		} catch (Exception e) {
			System.out.println("Error! You need to enter the correct parameters!");
		}
	}
}