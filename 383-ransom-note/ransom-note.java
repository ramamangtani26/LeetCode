class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer>map=new HashMap<>();
        char[] arr1=r.toCharArray();
        char[] arr2=m.toCharArray();
        for(int i=0;i<m.length();i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        for(int j=0;j<r.length();j++){
            int count=map.getOrDefault(arr1[j],0);
            if(count==0){
                return false;
            }
            map.put(arr1[j],count-1);
        }
        return true;
    }
}