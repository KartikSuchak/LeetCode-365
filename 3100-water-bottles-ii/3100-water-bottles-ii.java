class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles;
        int empty = numBottles;
        while(numExchange <= empty){
            empty = empty - numExchange + 1;
            numExchange++;
            drunk++;
        }
        return drunk;
    }
}