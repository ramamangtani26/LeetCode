class Solution {
    public boolean wordPattern(String pattern, String s) {
       HashMap<Character,String> map=new HashMap<>();
       HashMap<String,Character> map2=new HashMap<>();
       String[] words=s.split(" ");
       if(pattern.length()!=words.length){
        return false;
       }
       for(int i=0;i<pattern.length();i++){
        char ch=pattern.charAt(i);
        String k=words[i];
        if(map.containsKey(ch)){
            if(!map.get(ch).equals(k)){
                return false;
            }
        }
        if(map2.containsKey(k)){
            if(!map2.get(k).equals(ch)){
                return false;
            }
        }
        map.put(ch,k);
        map2.put(k,ch);
        
       }
       return true;
    }
}