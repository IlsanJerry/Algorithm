package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_2Darray_2167 {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer ST = new StringTokenizer(BR.readLine());
		
		int N = Integer.parseInt(ST.nextToken());
		int M = Integer.parseInt(ST.nextToken());
		int DP[][] = new int[N + 1][M + 1];
		
		for (int i = 1; i <= N; i++) {
			ST = new StringTokenizer(BR.readLine());
			for (int j = 1; j <= M; j++) 
				DP[i][j] = DP[i - 1][j] + DP[i][j - 1] - DP[i - 1][j - 1] + Integer.parseInt(ST.nextToken());
			
		}
		
		int T = Integer.parseInt(BR.readLine());
		for (int z = 0; z < T; z++) {
			ST = new StringTokenizer(BR.readLine());
			
			int i = Integer.parseInt(ST.nextToken());
			int j = Integer.parseInt(ST.nextToken());
			int x = Integer.parseInt(ST.nextToken());
			int y = Integer.parseInt(ST.nextToken());
			
			bw.write(String.valueOf(DP[x][y] + DP[i - 1][j - 1] - DP[i - 1][y] - DP[x][j - 1]));
			bw.write("\n");
		}
		bw.flush();
	}
}
