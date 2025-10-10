class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int m = energy.length;
        int strength = 0;
        int max = -1001;
        int i = m - 1;

        while(i >= 0){
            if(i + k < m){
                strength = energy[i] + energy[i + k];
            }
            else{
                strength = energy[i];
            }
            energy[i] = strength;
            if(strength > max){
                max = strength;
            }
            i--;
        }
        return max;
    }
}