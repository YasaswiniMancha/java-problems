package problem.approach.twoPointers;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] arr1= {2, 2, -1, -1, -3, -2, 1, -2, 1, 3};
	       int t1= 8;
	       int [] arr2= {-1,2,1,-4,-2};
	       int t2= -9;
	       int[] arr3= {0,0,0};
	       int t3= 0;
	       System.out.println("first case: "+threeSumClosest(arr1, t1));
	       System.out.println("second case: "+threeSumClosest(arr2, t2));
	       System.out.println("third case: "+threeSumClosest(arr3, t3));

	}

	private static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int n= nums.length;
		int closest = nums[0]+nums[1]+nums[2]; //assumption
		for(int i=0; i<n-2; i++) {
			if(i<0 && nums[i]==nums[i+1]) continue;
			int left = i+1;  //Use two pointers (left, right) to choose the other 2 numbers.
			int right= n-1;
			while(left<right) {
				int sum= nums[i] +nums[left] +nums[right];
				if(Math.abs(sum-target) < Math.abs(closest-target)) { //compare difference with target
					closest=sum;  //Track the closest sum while moving the pointers.
				  }
				if(sum<target) {
					left++;
				} else if(sum>target) {
					right--;
				} else {
					return sum;
				}
				 
			}
		}
		return closest;
	}
	
	

}
