public class solidsquare {
	public static void main(String[] args) {
		int n = 4;

		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
