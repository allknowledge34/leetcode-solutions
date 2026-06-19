class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int max = 0;
        for (int i : gain) {
            max = Math.max(max, start + i);
            start += i;
        }
        return max;
    }
}