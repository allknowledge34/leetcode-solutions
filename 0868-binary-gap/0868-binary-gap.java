class Solution {
    public int binaryGap(int n) {
        int ans = 0;
        for (int i = -32; n>0; n /= 2, i++){
            if(n % 2 == 1){
                ans = Math.max(ans, i);
                i = 0;
            }
        }
        return ans;
    }
}