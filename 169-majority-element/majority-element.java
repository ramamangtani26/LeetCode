class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int j=0;j<n;j++){
            if(map.get(nums[j])>n/2){
                return nums[j];
            }
        }
        return -1;
    }
}