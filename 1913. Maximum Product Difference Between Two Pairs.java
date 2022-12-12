/*

The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

Return the maximum such product difference.
    
*/

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return Math.abs((nums[0]*nums[1]) - (nums[nums.length-2]*nums[nums.length-1]));
    }
}

//Alternate solution

class Solution {
    public int maxProductDifference(int[] nums) {
	int largest = 0, secondLargest = 0, smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]>=largest) {
			secondLargest = largest;
			largest = nums[i];
		} else if(nums[i]>secondLargest) secondLargest = nums[i];
		if(nums[i]<=smallest) {
			secondSmallest = smallest;
			smallest = nums[i];
		} else if(nums[i]<secondSmallest) secondSmallest = nums[i];
	}
	return largest * secondLargest - smallest * secondSmallest;
}
}


