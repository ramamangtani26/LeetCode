class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int length=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                while(set.contains(ch)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(ch);
            }
            length=Math.max(length,set.size());
        }
        return length;
    }
}