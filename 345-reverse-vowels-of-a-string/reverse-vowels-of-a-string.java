class Solution {
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
            return true;
        }
        else if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U'){
            return true;
        }
        else {
            return false;
        }
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(isVowel(arr[left])){
                if(isVowel(arr[right])){
                    char temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
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
       return new String(arr); 
    }
}