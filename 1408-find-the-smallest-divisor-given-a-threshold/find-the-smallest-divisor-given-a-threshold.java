class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right){
                right=nums[i];
            }
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    sum+=1;
                }
                else{
                    int k=nums[i]/mid;
                    if(nums[i]%mid!=0){
                            sum+=k+1;
                    }
                    else{
                        sum+=k;
                    }
                 }
            }
            if(sum<=threshold){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}