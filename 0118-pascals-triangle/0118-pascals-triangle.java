class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

    for(int i = 0; i < numRows; i++){
      Integer[] row = new Integer[i + 1];
      Arrays.fill(row, 1);
      res.add(Arrays.asList(row));
    }

    for(int i = 2; i < numRows; i++){
      for(int j = 1; j < res.get(i).size() - 1; j++){
        res.get(i).set(j, res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
      }
    }
    return res;
    }
}