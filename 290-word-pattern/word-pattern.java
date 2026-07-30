class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String ch2=words[i];
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(ch2)){
                    return false;
                }
            }
            if(map2.containsKey(ch2)){
                if(!map2.get(ch2).equals(ch)){
                    return false;
                }
            }
            map1.put(ch,ch2);
            map2.put(ch2,ch);
        }
        return true;
    }
}