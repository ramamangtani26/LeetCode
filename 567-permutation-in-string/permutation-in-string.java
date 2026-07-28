class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] freq1=new int[26];
       int[] freq2=new int[26];
       if(s1.length()>s2.length()){
        return false;
       }
       for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq1[ch-'a']++;
       }
       for(int j=0;j<s1.length();j++){
            char c=s2.charAt(j);
            freq2[c-'a']++;
        } 
        for(int k=s1.length();k<s2.length();k++){
            if( Arrays.equals(freq1,freq2)){
                return true;
            }
            else{
                freq2[s2.charAt(k-s1.length())-'a']--;
                freq2[s2.charAt(k)-'a']++;
            }
        }
     return Arrays.equals(freq1,freq2);

    }
}