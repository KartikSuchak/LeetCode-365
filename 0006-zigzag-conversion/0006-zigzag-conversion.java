class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        int m = s.length();
        char[][] arr = new char[numRows][m];

        int i = 0;
        int row = 0;
        int col = 0;

        while(i < m){
            while(row < numRows && i < m){
                arr[row][col] = s.charAt(i);
                row++;
                i++;
            }

            row = numRows - 2;
            col++;

            while(row > 0 && i < m){
                arr[row][col] = s.charAt(i);
                row--;
                col++;
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char[] rows : arr){
            for(char val : rows){
                if(val != '\0'){
                    sb.append(val);
                }
            }
        }
        return sb.toString();
    }
}