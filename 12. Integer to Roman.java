class Solution {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
        String[] symbols = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (num > 0) {
            int times = num / values[index];
            for (int i = 0; i < times; i++) {
                sb.append(symbols[index]);
                num -= values[index];
            }
            index++;
        }
        return sb.toString();
    }
}