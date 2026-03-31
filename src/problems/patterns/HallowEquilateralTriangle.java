package problems.patterns;

public class HallowEquilateralTriangle {

	public static void printPattern(int n) {
		int i, j, k;

		for (i = 1; i <= n; i++) {

			for (j = i; j < n; j++) { 
				System.out.print(" ");
			}

			for (k = 1; k <= (2 * i - 1); k++) { //k=1 - 1

				if ( (i==n && k%2!=0) || k == (2 * i - 1) || k == 1) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}

			System.out.println(" ");
		}
	}

	public static void main(String args[]) {
		int n = 6;
		printPattern(n);
	}
}