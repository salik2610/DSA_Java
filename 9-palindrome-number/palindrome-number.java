class Solution {
    public boolean isPalindrome(int x) {
        int originalNum=x;
        int reversed=0;
        while(x>0){
            int digit=x%10;
            reversed=reversed*10+digit;
            x=x/10;
        }
        if(reversed==originalNum){
            return true;
        }
        return false;
    }
}