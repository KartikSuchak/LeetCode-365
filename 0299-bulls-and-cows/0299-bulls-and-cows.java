class Solution {
    public String getHint(String secret, String guess) {
        char[] sec = secret.toCharArray();
        char[] gue = guess.toCharArray();

        int m = sec.length;
        int bulls = 0;
        int cows = 0;
        
        for(int i = 0 ; i < m ; i++){
            if(sec[i] == gue[i]){
                bulls++;
            }
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < m ; j++){
                if(sec[i] == gue[j] && i != j && sec[i] != gue[i] && sec[j] != gue[j]){
                    cows++;
                    gue[j] = '*';
                    break;
                }
            }
        }

        return bulls + "A" + cows + "B";
    }
}