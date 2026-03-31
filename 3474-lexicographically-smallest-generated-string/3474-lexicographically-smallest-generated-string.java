class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int size = n + m - 1;

        char[] word = new char[size];
        boolean[] modifiable = new boolean[size];

        for (int i = 0; i < size; i++) {
            word[i] = '?';
            modifiable[i] = true;
        }

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    int pos = i + j;
                    if (word[pos] != '?' && word[pos] != str2.charAt(j)) {
                        return "";
                    }
                    word[pos] = str2.charAt(j);
                    modifiable[pos] = false;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (word[i] == '?') {
                word[i] = 'a';
            }
        }

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                if (matches(word, i, str2)) {
                    int changePos = -1;

                    for (int j = 0; j < m; j++) {
                        int pos = i + j;
                        if (modifiable[pos]) {
                            changePos = pos;
                        }
                    }

                    if (changePos == -1) return "";

                    word[changePos] = 'b';
                    modifiable[changePos] = false;
                }
            }
        }

        return new String(word);
    }

    private boolean matches(char[] word, int start, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            if (word[start + i] != str2.charAt(i)) return false;
        }
        return true;
    }
}