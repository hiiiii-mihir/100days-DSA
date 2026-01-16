//9. Palindrome Number


class Solution {
    public boolean isPalindrome(int x) {

         if (x < 0) 
            return false;

        int count = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return count==reverse ;
        
    }
}
