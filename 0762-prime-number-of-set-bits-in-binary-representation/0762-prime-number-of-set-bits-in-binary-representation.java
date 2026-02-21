class Solution {
    public int countSetBits(int n){
        int count = 0;
        while(n>0){
            int rem = n%2;
            count += rem;
            n /= 2;
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            int num = countSetBits(i);
            if(isPrime(num)) count++;
        }
        return count;
    }
}