class Solution {
    public int numDistinct(String S, String T) {
	int sl = S.length();
	int tl = T.length();
	
	int [][] dp = new int[tl+1][sl+1];

	for(int i=0; i<=sl; ++i){
		dp[0][i] = 1;
	}
	
	for(int t=1; t<=tl; ++t){
		
		for(int s=1; s<=sl; ++s){
			if(T.charAt(t-1) != S.charAt(s-1)){
				dp[t][s] = dp[t][s-1];
			}else{
				dp[t][s] = dp[t][s-1] + dp[t-1][s-1];
			}
		}	
	}
	
	return dp[tl][sl];
}
}