package uos;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			printDan(i);
		}
	}

	private static void printDan(int i) {
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + " x " + i + " = " + i * j);
		}
	}

}
