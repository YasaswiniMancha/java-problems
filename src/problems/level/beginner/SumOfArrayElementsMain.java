package problems.level.beginner;

import java.util.Scanner;

public class SumOfArrayElementsMain {

    public static void main(String[] args) {
        // Create an instance of SumUpArrayElements
        SumOfArrayElements sm = new SumOfArrayElements();

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array with the given size
        int[] nums = new int[n];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the runningSum method and pass the input array
        sm.runningSum(nums);
        sm.runningSumWithOverrideMethod(nums);

        // Close the scanner to avoid resource leakage
        scanner.close();
    }
}


 class SumOfArrayElements {

    // Method to calculate the running sum of an array
    public int[] runningSum(int[] nums) { //time complexity: o(n) space comlexity: o(1)
    	
        int[] results = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            // Ensure no negative index is accessed
            if (i == 0) {
                results[i] = nums[i];  // First element is the same
            } else {
                results[i] = nums[i] + results[i - 1];  // Add previous result
            }
        }
        
        // Display the results
        System.out.println("results array: ");
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
        
        return results;
    }
    
    
    

    public int[] runningSumWithOverrideMethod(int[] nums) { //time complexity: o(n) space comlexity: o(1)
        
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
        }
        
        System.out.println("nums array using Override Method for sum up: ");
        for (int num : nums) {
            System.out.print(num + " "); // Print each number in the array
        }
        System.out.println();
        
        return nums;
    }


}