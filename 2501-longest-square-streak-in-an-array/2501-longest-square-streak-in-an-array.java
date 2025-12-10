class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int ans = 1;

        for(int i=0;i<nums.length;i++){
            long x = nums[i];
            int count = 1;

            while(true){
                long sq = x * x;
                if(sq > Integer.MAX_VALUE) break;
                if(!set.contains((int)sq)) break;
                count++;
                x = sq;
            }

            if(count > ans) ans = count;
        }

        if(ans < 2) return -1;
        return ans;
    }
}
