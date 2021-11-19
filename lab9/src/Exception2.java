import java.util.Scanner;

public class Exception2 {
	public void exceptionDemo() {
		Scanner myScanner = new Scanner( System.in );
		System.out.print( "Enter an integer ");
		String intString = myScanner.next();

		try {
			int i = Integer.parseInt(intString);
			System.out.println(2 / i);
		}
		/*
		catch (Exception e)
		{

		}
		*/
		catch (ArithmeticException e) {
			System.out.println("Division by zero");
		}
		catch (NumberFormatException e) {
			System.out.println("Wrong format (not integer)");
		}
		finally {
			System.out.println("FIN");
		}
	}
}