class Solution {
    public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(left<right){
            char ch1=sb.charAt(left);
            char ch2=sb.charAt(right);
            if(Character.isLetter(ch1)){
                if(Character.isLetter(ch2)){
                    char temp=ch1;
                    sb.setCharAt(left, ch2);
                    sb.setCharAt(right, temp);
                    left++;
                    right--;
                }
                else{
                    right--;
                }
            }
            else{
                left++;
            }
        }
        return sb.toString();
    }
}