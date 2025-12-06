class Solution {
    public boolean completePrime(int num) {
        String s = String.valueOf(num);
        int m = s.length();

        for(int i = 0 ; i < m ; i++){
            int prefix = Integer.parseInt(s.substring(0, i + 1));
            int suffix = Integer.parseInt(s.substring(i));
            if(!isPrime(prefix) || !isPrime(suffix)){
                return false;
            }
        }
        return true;
    }

    private boolean isPrime(int x){
        if(x <= 1){
            return false;
        }
        if(x == 2 || x == 3){
            return true;
        } 
        if(x % 2 == 0 || x % 3 == 0){
            return false;
        }
        for(int i = 5 ; i * i <= x ; i += 6){
            if(x % i == 0 || x % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
