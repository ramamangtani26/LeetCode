class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int j=0;j<nums.length;j++){
            if(map.get(nums[j])>1){
                return nums[j];
            }
        }
        return -1;
    }
}