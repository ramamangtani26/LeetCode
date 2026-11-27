class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int n=grid.length;
        int[] ans=new int[2];
        int sq=n*n;
        int actualSum=(sq*(sq+1))/2;
        int currentsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                    currentsum+=grid[i][j];
                }
                else{
                    ans[0]=grid[i][j];
                }

            }
        }
        ans[1]=actualSum-currentsum;
        return ans;
    }
}