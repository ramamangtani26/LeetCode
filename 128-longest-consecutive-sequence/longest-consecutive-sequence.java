class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        
        int maxCount=0;
        for(int num:set){
            if(!set.contains(num-1)){
                //int num=num;
                int count=0;
                while(set.contains(num)){
                count++;
                num=num+1;
            }
            maxCount=Math.max(maxCount,count);
            }
            
        }
        return maxCount;
    }
}