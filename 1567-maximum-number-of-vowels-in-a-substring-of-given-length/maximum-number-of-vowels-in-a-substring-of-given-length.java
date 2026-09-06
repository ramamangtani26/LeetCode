class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int count=0;
        int maxCount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e' || ch=='i'|| ch=='o'||ch=='u'){
                count++;
            }
            if(i-left+1 > k){
                char c=s.charAt(left);
                if(c=='a'||c=='e' || c=='i'|| c=='o'||c=='u'){
                    count--;
                }
                left++;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}