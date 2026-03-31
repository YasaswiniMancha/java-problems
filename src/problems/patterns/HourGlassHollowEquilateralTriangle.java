package problems.patterns;

public class HourGlassHollowEquilateralTriangle {
	public static void main(String[] args) {
		int rows = 6;

		
		for (int i = rows; i >= 1; i--) {
			// Inner loop to print leading spaces for alignment
			for (int j = i; j <= rows; j++) {
				System.out.print(" ");
			}

			// Inner loop to print stars and inner spaces
			for (int j = 1; j <= 2 * i - 1; j++) {
				// Check if it's the first or last column of the current row, or the very last
				// row
				if ((i == rows && j % 2 != 0) || j == 2 * i - 1 || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Move to the next line
			System.out.println();
		}
		for (int i = 2; i <= rows; i++) {
			// Inner loop to print leading spaces for alignment
			for (int j = i; j <= rows; j++) {
				System.out.print(" ");
			}

			// Inner loop to print stars and inner spaces
			for (int j = 1; j <= 2 * i - 1; j++) {
				// Check if it's the first or last column of the current row, or the very last
				// row
				if ((i == rows && j % 2 != 0) || j == 2 * i - 1 || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Move to the next line
			System.out.println();
		}
	}
}