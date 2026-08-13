class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int k=x;
        while(x!=0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(k==rev && k>=0){
            return true;
        }
        return false;
    }
}