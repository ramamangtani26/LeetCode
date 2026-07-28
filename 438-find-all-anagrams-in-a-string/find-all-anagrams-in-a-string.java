class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1=new int[26];
        int[]freq2=new int[26];
        List<Integer> list=new ArrayList<>();
        if(p.length()>s.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            freq2[ch-'a']++;
        }
        for(int j=0;j<p.length();j++){
            char ch=s.charAt(j);
            freq1[ch-'a']++;
        }
        for(int k=p.length();k<s.length();k++){
            if(Arrays.equals(freq1,freq2)){
                list.add(k-p.length());
            }

                freq1[s.charAt(k-p.length())-'a']--;
                freq1[s.charAt(k)-'a']++;
            
        }
         if(Arrays.equals(freq1,freq2)){
                list.add(s.length()-p.length());
        }
        
        return list;
    }
}