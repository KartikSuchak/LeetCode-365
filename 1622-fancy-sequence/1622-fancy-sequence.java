class Fancy {
    ArrayList<Long> list;
    long mul, add;
    long MOD = 1_000_000_007L;

    public Fancy() {
        list = new ArrayList<>();
        mul = 1;
        add = 0;
    }
    
    public void append(int val) {
        long stored = ((val - add + MOD) % MOD * modInverse(mul)) % MOD;
        list.add(stored);
    }
    
    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }
    
    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }
    
    public int getIndex(int idx) {
        if (idx >= list.size()) return -1;
        long ans = (list.get(idx) * mul) % MOD;
        ans = (ans + add) % MOD;
        return (int) ans;
    }

    private long modInverse(long x) {
        return power(x, MOD - 2);
    }

    private long power(long a, long b) {
        long res = 1;
        a %= MOD;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */