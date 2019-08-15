package BackJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_mirror_2178 {

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static int n, m;
	public static int map[][];
	public static boolean visit[][];

	// BFS
	public static void bfs(int x, int y) {
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		qx.add(x); qy.add(y);
		
		while(!qx.isEmpty()&&!qy.isEmpty()) {
			x=qx.poll();
			y=qy.poll();
			visit[x][y]=true;
			
			for(int i=0; i<4 ; i++) {
				int xx = x + dx[i];
				int yy = y + dy[i];
				
				if(xx>=0 && yy>=0 && xx<n &&yy<m) {
					if(map[xx][yy]==1 && visit[xx][yy]==false) {
						qx.add(xx);
						qy.add(yy);
						visit[xx][yy] = true;
						map[xx][yy] = map[x][y]+1;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		map = new int[100][100];
		visit = new boolean[100][100];

		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			for (int j = 0; j < m; j++) {
				map[i][j] = temp.charAt(j) - 48;
			}
		}

		bfs(0, 0);
		System.out.println(map[n - 1][m - 1]);
	}

}
