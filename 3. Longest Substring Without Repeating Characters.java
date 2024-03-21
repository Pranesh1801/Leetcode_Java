class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0, right=0;
        int maxLen = 0;
        while(right<s.length()) {
            char curr = s.charAt(right);
            if(!set.contains(curr)) {
                set.add(curr);
                maxLen = Math.max(maxLen, right-left + 1);
                right++;
            }
            else { 
            set.remove(s.charAt(left));
            left++;
            }
        }
        return maxLen;
    }
}