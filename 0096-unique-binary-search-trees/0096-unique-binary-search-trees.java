class Solution {
    public int numTrees(int n) {
        long num = 1;
        for (int i = 0; i < n; i++) {
            num = num * (2 * i + 1) * 2 / (i + 2);
        }
        return (int) num;
    }
}
