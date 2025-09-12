class Solution {
    public int lastStoneWeight(int[] stones) {
        int m = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for (int i = 0; i < m; i++) {
            pq.add(stones[i]);
        }
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            if (first != second) {
                pq.add(first - second);
            }
        }
        if (pq.isEmpty()) {
            return 0;
        } else {
            return pq.peek();
        }
    }
}
