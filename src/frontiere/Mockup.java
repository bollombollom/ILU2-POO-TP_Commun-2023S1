package frontiere;

import java.util.Scanner;

public class Mockup {

	private static boolean DEBUG = true;
	private static Scanner scanner = new Scanner(System.in);

	public static int giveValueIfDebug(int value) {
		if (DEBUG)
			return value;
		else
			return scanner.nextInt();
	}

	public static String giveValueIfDebug(String value) {
		if (DEBUG)
			return value;
		else
			return scanner.next();
	}

}
