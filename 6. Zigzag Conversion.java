class Solution {
    public String removeSpaces(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                str.append(c);
            }
        }
        return str.toString();
    }
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        StringBuilder str = new StringBuilder();
        List<Character>[] rows = new List[numRows];
        int k = 0;
        int direction = -1;
        for (int i = 0; i < numRows; ++i) {
            rows[i] = new ArrayList<>();
        }
        s = removeSpaces(s);
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            rows[k].add(c);
            if (k == 0 || k == numRows - 1)
                direction *= -1;
            k += direction;
        }
        for (int i = 0; i < rows.length; i++) {
            List<Character> row = rows[i];
            for (int j = 0; j < row.size(); j++) {
                char c = row.get(j);
                str.append(c);
            }
        }
        return str.toString();
    }
}