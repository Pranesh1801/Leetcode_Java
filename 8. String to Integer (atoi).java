public class Solution {
    public int myAtoi(String s) {
        int index = 0;
        long sign = 1, total = 0;
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            char check = s.charAt(index);
            if (check == '+') {
                sign = 1;
            } else {
                sign = -1;
            }
            index++;
        }
        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            total = total * 10 + digit;
            if (sign == 1 && total > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && -total < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int) (total * sign);
    }
}