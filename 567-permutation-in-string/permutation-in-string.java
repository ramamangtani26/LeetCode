class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] frq1=new int[26];
        int[] frq2=new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(char ch:s1.toCharArray()){
            frq1[ch-'a']++;
        }
        for(int j=0;j<s1.length();j++){
            char ch=s2.charAt(j);
            frq2[ch-'a']++;
        }
        for(int k=s1.length();k<s2.length();k++){
            char z=s2.charAt(k);
            if(Arrays.equals(frq1,frq2)){
                return true;
            }
            
            else{
                frq2[s2.charAt(k-s1.length())-'a']--;
                frq2[z-'a']++;
            }
        }
        return Arrays.equals(frq1,frq2);
    }
}