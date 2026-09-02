class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        char [] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        for(int i=0;i<s.length();i++){
            //ch[i]=s.charAt(i);
            map.put(ch1[i],map.getOrDefault(ch1[i],0)+1);
        }
        
        for(int j=0;j<t.length();j++){
            map2.put(ch2[j],map2.getOrDefault(ch2[j],0)+1);
        }
        return map.equals(map2);
    }
}