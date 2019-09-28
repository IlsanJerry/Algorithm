package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class DFS_FindRoute_11403 {

	static int[][] a;
	static int[] c;
	static int[][] route;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		a = new int[n + 1][n + 1];
		c = new int[n + 1];
		route = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 1; i <= n; i++) {
			dfs(i);

			for (int j = 1; j <= n; j++) {
				route[i][j] = c[j];
			}

			Arrays.fill(c, 0);
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(route[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void dfs(int v) {
		int n = a.length - 1;

		for (int i = 1; i <= n; i++) {

			if (a[v][i] == 1 && c[i] == 0) {
				c[i] = 1;
				dfs(i);
				//dfs(i);
			}
		}

	}

}