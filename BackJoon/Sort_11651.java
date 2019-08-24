package BackJoon;

import java.util.Scanner;

public class Sort_11651 {

	static int sort[][];
	static void mgSort(int ary[][], int start, int end) {

		if (end <= start) return;

		int center = (start + end) / 2;
		mgSort(ary, start, center);
		mgSort(ary, center + 1, end);
		merging(ary, start, center, end);
	}

	static void merging(int ary[][], int start, int center, int end) {

		int i = start, j = center + 1, k = start;
		while (i <= center && j <= end) {

			if (ary[i][1] < ary[j][1])
				sort[k++] = ary[i++];
			
			else if (ary[i][1] > ary[j][1])
				sort[k++] = ary[j++];
			
			else {
				if (ary[i][0] <= ary[j][0])
					sort[k++] = ary[i++];
				else
					sort[k++] = ary[j++];
			}
		}

		if (i > center) {
			while (j <= end)
				sort[k++] = ary[j++];
		}

		if (j > end) {
			while (i <= center)
				sort[k++] = ary[i++];
		}

		for (int x = start; x <= end; x++) {
			ary[x] = sort[x];
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int ary[][] = new int[N][2];

		sort = new int[N][2];
		for (int i = 0; i < N; i++) {
			ary[i][0] = scan.nextInt();
			ary[i][1] = scan.nextInt();
		}
		scan.close();
		mgSort(ary, 0, N - 1);
		
		for (int i = 0; i < N; i++) {
			System.out.println(ary[i][0] + "  " + ary[i][1]);
		}
	}
}
