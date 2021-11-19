import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo6 {
	public void getKey() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter Line ");
		String key = myScanner.nextLine();
		printDetails(key);
	}

	public void printDetails(String key) {
		try {
			String message = getDetails(key);
			System.out.println(message);
		} catch (Exception e) {
			System.out.println("Line empty");
		}
	}

	private String getDetails(String key) throws Exception {
		if (Objects.equals(key, "")) {
			throw new Exception("Empty line received");
		}
		return "data for " + key;
	}
}