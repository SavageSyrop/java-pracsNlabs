import java.util.Scanner;

public class ThrowsDemo7 {
	public void getKey() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter Line ");

		while (myScanner.hasNextLine()) {
			try {
				String key = myScanner.nextLine();
				printDetails(key);
				break;
			} catch (Exception e) {
				System.out.println("Empty line");
			}
		}
	}

	public void printDetails(String key) throws Exception {
		String message = getDetails(key);
		System.out.println(message);
	}

	private String getDetails(String key) throws Exception {
		if (key.equals("")) {
			throw new Exception("Key set to empty string");
		}
		return "data for " + key;
	}
}
