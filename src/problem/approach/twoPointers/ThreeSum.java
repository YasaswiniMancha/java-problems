package problem.approach.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
	       int[] arr1= {2, 2, -1, -1, -3, -2, 1, -2, 1, 3};
	       int t1= 2;
	       int [] arr2= {1, 0, -1, 0, 2, 2 };
	       int t2= 0;
	       System.out.println("first case: "+threeSum(arr1, t1));
	       System.out.println("second case: "+threeSum(arr2, t2));
	}
	
	public static List<List<Integer>> threeSum(int[] nums, int target) {
		List<List<Integer>> res= new ArrayList<>();
		Arrays.sort(nums);
		int n= nums.length;
		for(int i=0; i<n-2; i++) {
			if(i>0  && nums[i]==nums[i+1]) continue;
			int left = i+1;
			int right= n-1;
			while(left<right) {
			int sum= nums[i] +nums[right]+ nums[left];
			if(sum==target) {
				res.add(Arrays.asList(nums[i] ,nums[right], nums[left]));
				left++;
				right--;
			} if(sum<target) {
				left++;
			} if(sum>target) {
				right--;
		 	}
		   }
		}
		return res;
	}
}
