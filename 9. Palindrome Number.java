public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int num = x;
        while (x != 0) {
            int n = x % 10;
            rev = rev * 10 + n;
            x /= 10;
        }
        return num == rev;
    }
}