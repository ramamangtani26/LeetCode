class Solution {
    public String reverseWords(String s) {
    int i=0;
    int n=s.length();
    StringBuilder sb=new StringBuilder(s);
    while(i<n){
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int start=i;
         
        while(i<n && s.charAt(i)!=' '){
            i++;
        }
        int end=i-1;
        while(start<end){
            char ch1=sb.charAt(start);
            char ch2=sb.charAt(end);
            sb.setCharAt(start,ch2);
            sb.setCharAt(end,ch1);
            start++;
            end--;
        }
        }
    return sb.toString();
    }
}