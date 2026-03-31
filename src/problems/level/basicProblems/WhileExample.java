package problems.level.basicProblems;
public class WhileExample {
public static void main(String[] args) {
        int i = 5; // Initialize i with value 5

        // While loop (runs only if condition is true initially)
        while (i < 0) { // Condition: i should be less than 0
            System.out.println("This is a while loop iteration."); // Print message
            i--; // Decrement i
        }

        // End of program (no return needed)
    }
}

//while loop, the condition is checked before the code block, meaning the code might not execute if the initial condition is false.