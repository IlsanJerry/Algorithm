package BackJoon;

import java.util.*;

public class BFS_Sheep_3184 {
	static int[][] ary;
	static int r, c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		ary = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			String t = sc.next();
			for (int j = 0; j < c; j++)
				ary[i][j] = t.charAt(j);
		}

		/* visit */
		visited = new boolean[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				if (ary[i][j] != '#' && !visited[i][j])
					find(i, j);
			}
		}
		System.out.println(toSheep + " " + toWolf);
	}

	static boolean[][] visited;
	static int toWolf, toSheep;
	static int[][] range = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	private static void find(int x, int y) {
		Queue<Both> queue = new LinkedList<>();
		queue.add(new Both(x, y));
		visited[x][y] = true;
		int Wolf = 0, Sheep = 0;
		
		/* Wolf or Sheep when started */
		if (ary[x][y] == 'v')
			Wolf++;
		else if (ary[x][y] == 'o')
			Sheep++;
		while (!queue.isEmpty()) {
			Both t = queue.poll();

			for (int i = 0; i < 4; i++) {
				int tx = t.x + range[i][0];
				int ty = t.y + range[i][1];
				if (tx < 0 || ty < 0 || tx >= r || ty >= c)
					continue;
				if (visited[tx][ty])
					continue;
				visited[tx][ty] = true;
				if (ary[tx][ty] == '#')
					continue;

				/* count */
				if (ary[tx][ty] == 'v')
					Wolf++;
				else if (ary[tx][ty] == 'o')
					Sheep++;
				queue.add(new Both(tx, ty));
			}
		}
		
		// count in range
		if (Wolf >= Sheep)
			toWolf += Wolf;
		else
			toSheep += Sheep;
	}

	static class Both {
		private int x, y;
		Both(int x, int y) {
			this.x = x; this.y = y;
		}
	}
}
