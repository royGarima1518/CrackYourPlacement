class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();
        int n = s.length();

        // Record the last index of each character
        for (int i = 0; i < n; i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (!seen[idx]) {
                while (result.length() > 0 
                       && ch < result.charAt(result.length() - 1) 
                       && lastIndex[result.charAt(result.length() - 1) - 'a'] > i) {
                    seen[result.charAt(result.length() - 1) - 'a'] = false;
                    result.deleteCharAt(result.length() - 1);
                }

                result.append(ch);
                seen[idx] = true;
            }
        }

        return result.toString();
    }
}
