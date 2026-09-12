class Solution {
    private void findsubset(int ind,int[] arr,List<List<Integer>> ans,List<Integer> list){
        
            ans.add(new ArrayList<>(list));

        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            list.add(arr[i]);
            findsubset(i+1,arr,ans,list);
            list.remove((Integer)arr[i]);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        findsubset(0,nums,ans,new ArrayList<>());
        return ans;
    }
}