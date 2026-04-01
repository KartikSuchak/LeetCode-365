import java.util.*;

class Solution {
    class Robot {
        int pos, health, idx;
        char dir;
        Robot(int p, int h, int i, char d) {
            pos = p; health = h; idx = i; dir = d;
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Robot[] robots = new Robot[n];
        for (int i = 0; i < n; i++) {
            robots[i] = new Robot(positions[i], healths[i], i, directions.charAt(i));
        }

        Arrays.sort(robots, (a, b) -> a.pos - b.pos);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (robots[i].dir == 'R'){
                st.push(i);
            } 
            else {
                while (!st.isEmpty() && robots[i].health > 0) {
                    int j = st.peek();
                    if (robots[j].health < robots[i].health) {
                        st.pop();
                        robots[i].health--;
                        robots[j].health = 0;
                    } else if (robots[j].health > robots[i].health) {
                        robots[j].health--;
                        robots[i].health = 0;
                        break;
                    } else {
                        robots[j].health = 0;
                        robots[i].health = 0;
                        st.pop();
                        break;
                    }
                }
            }
        }

        List<int[]> res = new ArrayList<>();
        for (Robot r : robots){
            if (r.health > 0){
                res.add(new int[]{r.idx, r.health});
            } 
        } 

        Collections.sort(res, (a, b) -> a[0] - b[0]);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < res.size(); i++){
            ans.add(res.get(i)[1]);
        }

        return ans;
    }
}