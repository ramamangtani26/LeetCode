class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int left=weights[0];
      int sum=0;
      for(int i=0;i<weights.length;i++){
        if(left<weights[i]){
            left=weights[i];
        }
        sum+=weights[i];
      }
      int right=sum;
      while(left<=right){
        int mid=left+(right-left)/2;
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]<=mid){
                load+=weights[i];
        }
        else{
            day++;
            load=weights[i];
        }
        }
        if(day<=days){
            right=mid-1;
        }
        else{
            left=mid+1;
        }
        }
        return left;
    }
}