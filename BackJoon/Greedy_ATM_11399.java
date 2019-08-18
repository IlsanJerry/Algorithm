package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Greedy_ATM_11399 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		//N명
		int n = Integer.parseInt(br.readLine());
		
		//N명이 걸리는 시간
		int p[] = new int[n + 1];

		st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<n ; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = Greedy_line(p);
		System.out.println(result);
	}

	public static int Greedy_line(int x[]) {
		int temp = 0;
		int total = 0;
		
		Arrays.sort(x);
		for (int i=0; i<x.length ; i++) {
			temp  += x[i];
			total += temp;
		}
		return total;
	}
}
