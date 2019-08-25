package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Sort_ABC_3047 {
	private static BufferedWriter bw = 
			new BufferedWriter(new OutputStreamWriter(System.out));
	
	private static int N;	
	private static int m[] = new int[16];
	private static int ary[][];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st[] = br.readLine().split(" ");
		int ary[] = new int[3];
		
		for (int i=0 ; i<3 ; i++)
			ary[i] = Integer.parseInt(st[i]);
		Arrays.sort(ary);
		
		String st1[] = br.readLine().split("");
		for (int i=0 ; i<3 ; i++)
			bw.write(ary[st1[i].charAt(0)-'A'] + "  ");
		bw.flush();
	}
}
