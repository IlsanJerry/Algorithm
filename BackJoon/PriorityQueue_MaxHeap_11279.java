package BackJoon;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.IOException;

public class PriorityQueue_MaxHeap_11279 {
	static PriorityQueue<Integer> que;
	static int N, A;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());

		que = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer original, Integer other) {
				return other - original;
			}
		});

		for (int i=0 ; i<N ; i++) {
			A = Integer.parseInt(br.readLine());
			if (A == 0) sb.append((que.size() == 0 ? 0 : que.poll()) + "\n");
			else que.offer(A);
		}
		System.out.println(sb);
	}
}