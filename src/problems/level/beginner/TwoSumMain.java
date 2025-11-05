package problems.level.beginner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumMain {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int arrayLength = sc.nextInt();
		int[] nums = new int[arrayLength];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < arrayLength; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("enter the target :");
		int target = sc.nextInt();
		sc.close();

		TwoSumSolution ts  = new TwoSumSolution();

		int[] result = ts.twoSumUsingHashMap(nums, target);
		System.out.println(
				" indices that sum up to get target (twoSumUsingHashMap): [" + result[0] + ", " + result[1] + "]");

		int[] resultWithBruteForce = ts.twoSumUsingBruteForce(nums, target);
		System.out.println(" indices that sum up to get target (twoSumUsingBruteForce): [" + resultWithBruteForce[0]
				+ ", " + resultWithBruteForce[1] + "]");

		int[] resultWithTwoPointer = ts.twoSumUsingTwoPointer(nums, target);
		System.out.println(" indices that sum up to get target (twoSumUsingTwoPointer): [" + resultWithTwoPointer[0]
				+ ", " + resultWithTwoPointer[1] + "]");

	}
}



class TwoSumSolution {

	// ex: nums=[1, 2,3,4] and target= 4 then ==> result[]=(0,2)

	public int[] twoSumUsingHashMap(int[] nums, int target) { // o(n) - time complexity
		// Create a HashMap to store the value and its index
		Map<Integer, Integer> map = new HashMap<>();

		// Loop through the array
		for (int i = 0; i < nums.length; i++) { // it1: -> i=0,
			int complement = target - nums[i]; // it1-> 4-1=3

			// Check if the complement exists in the HashMap
			if (map.containsKey(complement)) { // 3 present in it-1 at num[2]

				// Return the indices of the two numbers that add up to the target
				return new int[] { map.get(complement), i }; // (2,0)
			}

			// Add the current number and its index to the HashMap
			map.put(nums[i], i);
		}

		// If no solution is found (though problem guarantees one), return an empty
		// array
		throw new IllegalArgumentException("No two sum solution");
	}

	public int[] twoSumUsingBruteForce(int[] nums, int target) { // o(n^2)- time complexity
		// Nested loop to check every pair of numbers
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				// If the sum of nums[i] and nums[j] equals the target
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		// If no solution is found
		throw new IllegalArgumentException("No two sum solution");
	}

	public int[] twoSumUsingTwoPointer(int[] nums, int target) {
		// Create a copy of the original array to keep track of indices after sorting
		int[][] numsWithIndices = new int[nums.length][2];
		for (int i = 0; i < nums.length; i++) {
			numsWithIndices[i][0] = nums[i]; // Store the value
			numsWithIndices[i][1] = i; // Store the original index
		}

		// Sort the array by the value (not the index)
		Arrays.sort(numsWithIndices, (a, b) -> Integer.compare(a[0], b[0]));

		// Use two pointers to find the two numbers
		int left = 0;
		int right = numsWithIndices.length - 1;

		while (left < right) {
			int sum = numsWithIndices[left][0] + numsWithIndices[right][0];

			if (sum == target) {
				// Return the original indices of the two numbers
				return new int[] { numsWithIndices[left][1], numsWithIndices[right][1] };
			} else if (sum < target) {
				left++; // Move the left pointer to the right
			} else {
				right--; // Move the right pointer to the left
			}
		}

		// If no solution is found
		throw new IllegalArgumentException("No two sum solution");
	}

}

