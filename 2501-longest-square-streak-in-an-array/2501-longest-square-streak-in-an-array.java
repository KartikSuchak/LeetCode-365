class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add((long)nums[i]);
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            long x = nums[i];
            long r = (long)Math.sqrt(x);
            if(r*r == x && set.contains(r)) continue;
            int len = 1;
            while(true){
                long nx = x*x;
                if(nx > 1000000000L) break;
                if(!set.contains(nx)) break;
                len++;
                x = nx;
            }
            if(len > ans) ans = len;
        }
        return ans >= 2 ? ans : -1;
    }
}
