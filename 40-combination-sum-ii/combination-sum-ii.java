class Solution {
    private void findCombinations(int ind,int target,List<List<Integer>> ans,int[]arr,List<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            list.add(arr[i]);
        findCombinations(i+1,target-arr[i],ans,arr,list);
        list.remove((Integer)arr[i]);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        findCombinations(0,target,ans,arr,new ArrayList<>());
        return ans;
    }
}