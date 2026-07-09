class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] q) {
        // root - based on diff of nums[i] & nums[i - 1] 
        // diff > maxDiff 
        boolean ans[] = new boolean[q.length]; 
        int root[] = new int[nums.length]; 
        root[0] = 0; 
        for(int i = 1; i < nums.length; i++) {
            root[i] = ((nums[i] - nums[i - 1]) <= maxDiff) ? root[i - 1] : i; 
        }

        for(int i = 0; i < q.length; i++) {
            ans[i] = root[q[i][0]] == root[q[i][1]]; 
        }
        return ans; 
    }
}