class Solution {
    public boolean judgeCircle(String moves) {
        int c1 = 0; 
        int c2 = 0; 

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') c1++;
            else if (ch == 'R') c1--;
            else if (ch == 'U') c2++;
            else if (ch == 'D') c2--;
        }

        return c1 == 0 && c2 == 0;
    }
}