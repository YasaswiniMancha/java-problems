package problem.approach.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
       int[] arr1= {2, 2, -1, -1, -3, -2, 1, -2, 1, 3};
       int t1= 2;
       int [] arr2= {1, 0, -1, 0, 2,2 };
       int t2= 0;
       System.out.println("first case: "+fourSum(arr1, t1));
       System.out.println("second case: "+fourSum(arr2, t2));
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {  //Loop until n - 3 so that we have space for 4 numbers
            if (i > 0 && nums[i] == nums[i - 1]) continue;  //Skip duplicates for i

            for (int j = i + 1; j < n - 2; j++) {  //Second loop — pick second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; //For the same i, j should also avoid duplicates.

                int left = j + 1;  //left moves forward → increases sum
                int right = n - 1;   //right moves backward → decreases sum


                while (left < right) {  //Try combinations of i, j, left, right
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {  //Found a valid quadruplet.Store it in arrayList
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;   //Need new pair numbers Avoid repeating same pair
                        right--;  
                        // Skip duplicates for left
                        while (left < right && nums[left] == nums[left - 1]) left++;

                        // Skip duplicates for right
                        while (left < right && nums[right] == nums[right + 1]) right--;

                    } else if (sum < target) {
                        left++;  //Need a bigger sum Moving left increases value (sorted array) since array is sorted in ascending order.
                    } else {
                        right--;   //Need a smaller sum Moving left decreases value (sorted array)  since array is sorted in ascending order.
                    }
                }
            }
        }
        return result;
    }
   
}
