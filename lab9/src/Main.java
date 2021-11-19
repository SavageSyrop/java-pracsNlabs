import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Exception1 e1 = new Exception1();
		e1.exceptionDemo();

		Exception2 e2 = new Exception2();		//QWERTY 1.2 1
		e2.exceptionDemo();


		ThrowsDemo e3 = new ThrowsDemo();
		e3.printMessage(null);
		e3.printMessage("botva");

		ThrowsDemo6 e4 = new ThrowsDemo6();
		e4.printDetails("");
		e4.printDetails("zashkvar");
		e4.getKey();

		ThrowsDemo7 e5 = new ThrowsDemo7();
		e5.getKey();
	}
}
