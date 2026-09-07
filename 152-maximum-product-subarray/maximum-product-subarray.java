class Solution {
    public int maxProduct(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       int maxPro=nums[0];
       for(int i=1;i<nums.length;i++){
            int temp=max;
            max=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min=Math.min(nums[i],Math.min(nums[i]*min,nums[i]*temp));
            maxPro=Math.max(max,maxPro);
       }
       return maxPro;
    }
}