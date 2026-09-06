class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder(s);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char c1=sb.charAt(left);
            char c2=sb.charAt(right);
            if(Character.isLetter(c1)){
                if(Character.isLetter(c2)){
                    sb.setCharAt(left,c2);
                    sb.setCharAt(right,c1);
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