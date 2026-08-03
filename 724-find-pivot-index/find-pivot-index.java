class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0;
        int rs=0;
        int ts=0;
        for(int i=0;i<nums.length;i++){
            ts+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            rs=ts-nums[j]-ls;
            if(ls==rs){
                return j;
            }
            ls=ls+nums[j];
        }
        return -1;
    }
}