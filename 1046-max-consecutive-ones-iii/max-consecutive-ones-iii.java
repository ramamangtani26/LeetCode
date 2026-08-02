class Solution {
    public int longestOnes(int[] nums, int k) {
       int left=0;
       int maxCount=0;
       int zeroesCount=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zeroesCount++;
        }
        while(zeroesCount>k){
            if(nums[left]==0){
                zeroesCount--;
            }
            left++;
        }
        maxCount=Math.max(maxCount,i-left+1);
       }
       return maxCount;
    }
}