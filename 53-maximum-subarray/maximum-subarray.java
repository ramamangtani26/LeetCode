class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxSum=nums[0];
        for(int right=1;right<nums.length;right++){
            sum=Math.max(nums[right],sum+nums[right]); 
           maxSum= Math.max(sum,maxSum);
        }
        return maxSum;
    }
}