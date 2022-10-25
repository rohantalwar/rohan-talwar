class Solution {
    public boolean isPalindromePositive(int x) {
        int reverseValue=0;
        int initalValue = x;
        while(x > 0) {
            reverseValue = 10*reverseValue+(x%10);
            x/=10;
        }
        return (reverseValue==initalValue);
    }
    public boolean isPalindrome(int x) {
       if(x < 0)
           return false;
       else {
           return isPalindromePositive(Math.abs(x));
       }
    }
}
