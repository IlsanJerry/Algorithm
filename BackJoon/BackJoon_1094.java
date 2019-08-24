package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackJoon_1094 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int min = 64;
		int X = Integer.parseInt(br.readLine());
		
		int A = min;
		int out = 1;

		while (A != X) {
			min = min / 2;
			if (X <= A - min) {
				A -= min;
				out--;
			}
			out++;
		}
		bw.write(String.valueOf(out));
		bw.flush();
	}
}
