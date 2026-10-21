class Solution {
    public int minOperations(String s) {
        char min = s.charAt(0);
        char max = s.charAt(0);
        boolean sorted = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < min)
                min = ch;
            if (ch > max)
                max = ch;

            if (i > 0 && ch < s.charAt(i - 1))
                sorted = false;
        }

        if (sorted)
            return 0;
        if (s.charAt(0) == min || s.charAt(s.length() - 1) == max)
            return 1;
        if (s.length() == 2 && !sorted)
            return -1;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        return 3;
    }
}