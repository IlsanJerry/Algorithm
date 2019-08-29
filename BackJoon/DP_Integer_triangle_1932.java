package BackJoon;

import java.util.*;

public class DP_Integer_triangle_1932 {
	
	public static int max(int M, int m){
		if(M > m)return M;
		else return m;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int [][] dp = new int[n][n];
			
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<=i ; j++){
				dp[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1 ; i<n ; i++){
			for(int j=0 ; j<=i ; j++){
				if(j == 0) dp[i][j] += dp[i - 1][j];
				else if(i == j) dp[i][j] += dp[i -1][j -1];
				else dp[i][j] += max(dp[i - 1][j - 1], dp[i - 1][j]);
			}
		}	
		
		for(int i=0 ; i<n ; i++){
			if(max < dp[n - 1][i]) max = dp[n - 1][i];	
		}
		System.out.println(max);
	}

}
