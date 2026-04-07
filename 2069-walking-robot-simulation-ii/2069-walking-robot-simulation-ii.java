class Robot {

    int width, height;
    int x, y;
    int dir;
    int cycle;

    String[] directions = {"East", "North", "West", "South"};

    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
        this.dir = 0;
        this.cycle = 2 * (width + height) - 4;
    }
    
    public void step(int num) {

        num = num % cycle;

        while (num > 0) {

            if (dir == 0) {
                int move = Math.min(num, width - 1 - x);
                x += move;
                num -= move;

                if (num > 0) {
                    dir = 1;
                }

            } else if (dir == 1) {
                int move = Math.min(num, height - 1 - y);
                y += move;
                num -= move;

                if (num > 0) {
                    dir = 2;
                }

            } else if (dir == 2) {
                int move = Math.min(num, x);
                x -= move;
                num -= move;

                if (num > 0) {
                    dir = 3;
                }

            } else {
                int move = Math.min(num, y);
                y -= move;
                num -= move;

                if (num > 0) {
                    dir = 0;
                }
            }
        }

        if (x == 0 && y == 0 && num == 0) {
            dir = 3;
        }
    }
    
    public int[] getPos() {
        return new int[]{x, y};
    }
    
    public String getDir() {
        return directions[dir];
    }
}