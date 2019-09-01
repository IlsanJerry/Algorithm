package BackJoon;

import java.io.*;

public class Graph_Sumof_isalnd_4963 {

	public static int weight, height;
	public static int land[][];
	public static int i, j;
	public static String line[];

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder result = new StringBuilder();

		while (true) {
			int count = 0;
			line = in.readLine().split(" ");
			weight = Integer.parseInt(line[0]);
			height = Integer.parseInt(line[1]);

			land = new int[weight][weight];
			if (weight == 0 && height == 0)
				break;

			for (i = 0; i < height; i++) {
				line = in.readLine().split(" ");
				for (j = 0; j < weight; j++) {
					land[i][j] = Integer.parseInt(line[j]);
				}
			}

			for (i = 0; i < height; i++) {
				for (j = 0; j < weight; j++)
					if (land[i][j] > 0) {
						count++;
						search(i, j);
					}
			}
			result.append(count + "\n");
		}
		out.write(result.toString());
		out.close();
		in.close();
	}

	private static void search(int x, int y) {
		land[x][y] = 0;
		int i;
		int ax[] = { 0, 1, 1, 1, 0, -1, -1, -1 };
		int ay[] = { 1, 1, 0, -1, -1, -1, 0, 1 };
		int dx, dy;

		for (i = 0; i < 8; i++) {
			dx = x + ax[i];
			dy = y + ay[i];
			if (checkIn(dx, dy) && land[dx][dy] > 0)
				search(dx, dy);
		}
	}

	private static boolean checkIn(int x, int y) {
		return (0 <= x && x < height) && (0 <= y && y < weight);
	}

}
