class Solution {
    public int maxArea(int[] height) {
        int maxA=0;
        int left=0;
        int right=height.length-1;
        while(left<=right){
                int h=Math.min(height[left],height[right]);
                int width=right-left;
                int area=h*width;
                maxA=Math.max(area,maxA);   
               if(height[left]<height[right]){
                    left++;
               }
               else{
                right--;
               }
        }
        return maxA;
    }
}