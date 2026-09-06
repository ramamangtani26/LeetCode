class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> map=new HashMap<>();
       HashMap<Character,Character> map2=new HashMap<>();
       for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char bh=t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=bh){
                    return false;
                }
            }
            if(map2.containsKey(bh)){
                if(map2.get(bh)!=ch){
                    return false;
                }
            }
            map.put(ch,bh);
            map2.put(bh,ch);
       }
       return true;
    }
}