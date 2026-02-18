class Solution {
    public boolean hasAlternatingBits(int n) {
        final int a = n ^ (n>>1);
        return (a & (a +1)) == 0;
    }
}