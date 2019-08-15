package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP_CoinCombination {

	public static void main(String[] argS) throws IOException {

		int N,M;
		int[] coin;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while (test-- > 0) {

			N = Integer.parseInt(br.readLine());
			coin = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {

				coin[i] = Integer.parseInt(st.nextToken());
			}

			M = Integer.parseInt(br.readLine());

			int[] dp = new int[M + 1];
			System.out.println("dp"+dp.length);
			
			Arrays.fill(dp, 0);

			dp[0] = 1;
			for (int i = 0; i < N; i++) {
				for (int j = coin[i]; j <= M; j++) {
					dp[j] += dp[j - coin[i]];
				}
			}
			System.out.println(dp[M]);
		}
	}
}
