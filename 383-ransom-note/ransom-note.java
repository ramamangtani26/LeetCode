class Solution {
    public boolean canConstruct(String r, String m) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<m.length();i++){
        char ch=m.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for(int j=0;j<r.length();j++){
        char ch=r.charAt(j);
            int count=map.getOrDefault(ch,0);
            if(count==0){
                return false;
            }
            map.put(ch,count-1);

       }
       return true;
    }
}