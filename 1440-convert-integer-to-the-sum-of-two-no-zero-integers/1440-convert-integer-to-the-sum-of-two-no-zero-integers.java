class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        int value = 1;

        while (true) {
            int a = value;
            int b = n - value;
            boolean valid = true;
            int x = a;
            while (x > 0) {
                if (x % 10 == 0) {
                    valid = false;
                    break;
                }
                x = x / 10;
            }
            int y = b;
            while (y > 0 && valid) {
                if (y % 10 == 0) {
                    valid = false;
                    break;
                }
                y = y / 10;
            }
            if (valid) {
                result[0] = a;
                result[1] = b;
                break;
            }
            value++;
        }
        return result;
    }
}
