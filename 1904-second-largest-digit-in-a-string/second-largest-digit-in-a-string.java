class Solution {
    public int secondHighest(String s) {
        int max1=-1;
        int max2=-1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int v=s.charAt(i)-'0';
                if(max1<v){
                    max2=max1;
                    max1=v;
                }
                if(v<max1 && v>max2){
                    max2=v;
                }
            }
        }
        return max2;
    }
}