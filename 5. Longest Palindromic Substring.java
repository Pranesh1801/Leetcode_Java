class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        boolean arr[][] = new boolean[s.length()][s.length()];
        for(int i = s.length() - 1; i>=0; i--) {
            for(int j=i; j<s.length(); j++) {
                arr[i][j] = s.charAt(i) == s.charAt(j) && (j-i< 3 || arr[i+1][j-1]);
                if(arr[i][j] && (j-i > end - start)) {
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end+1);
    }
}