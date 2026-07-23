class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=piles[0];
        int z=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>right){
                right=piles[i];
            }
        }
        while(left<=right){
            long hr=0;
            int mid=left+(right-left)/2;
            int speed=mid;
            for(int i=0;i<piles.length;i++){
                if(piles[i]<=speed){
                    hr++;
                }
                else{
                    int k=piles[i]/speed;
                    if(piles[i]%speed==0){
                        hr+=k;
                    }
                    else{
                        hr+=k+1;
                    }
                }
            }
            if(hr<=h){
                right=mid-1;
                z=Math.min(mid,z);
            }
            else{
                left=mid+1;
            }
        }
        return z;
    }
}