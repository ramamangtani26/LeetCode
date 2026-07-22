class Solution {
    int ans1=-1;
    int ans2=-1;
    public int firstOccurence(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans1=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans1;
    }
    public int lastOccurence(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans2=mid;
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans2;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurence(nums,target);
        int last=lastOccurence(nums,target);
        return new int[]{first,last};
    }
}