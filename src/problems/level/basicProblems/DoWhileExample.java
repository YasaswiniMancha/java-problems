package problems.level.basicProblems;

public class DoWhileExample {
	public static void main(String[] args) {
		int i = 5;
		do {
			System.out.println("This is a do-while loop iteration."); // This is a do while loop iteration
			i--; // Decrement i
		} while (i < 0);
	}
}
//In a do-while loop, the condition is checked after the code block execution, guaranteeing at least one execution.