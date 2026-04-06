class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for (int[] o : obstacles) {
            set.add(o[0] + "," + o[1]);
        }

        int[] directions = {0, 1, 0, -1, 0};
        int dir = 0, x = 0, y = 0, distance = 0;

        for (int c : commands) {
            if (c == -1) {
                dir = (dir + 1) % 4;
            } 
            else if (c == -2) {
                dir = (dir + 3) % 4;
            } 
            else {
                for (int i = 0; i < c; i++) {
                    int dx = x + directions[dir];
                    int dy = y + directions[dir + 1];

                    if (set.contains(dx + "," + dy)) {
                        break;
                    }

                    x = dx;
                    y = dy;
                    distance = Math.max(distance, x * x + y * y);
                }
            }
        }
        return distance;
    }
}