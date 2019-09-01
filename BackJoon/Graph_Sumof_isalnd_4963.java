package BackJoon;

import java.io.*;
public class Graph_Sumof_isalnd_4963 {

	public static int weight, height ;
	public static int land[][];
	static String line [];
	static int i,j;
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringBuilder result = new StringBuilder();
		int count = 0;
		while(true) {
			line  = in.readLine().split(" ");
			weight = Integer.parseInt(line[0]);
			height = Integer.parseInt(line[1]);
			
			land = new int[weight][height];
			if(weight==0 && height==0) break;
			
			for(i=0 ; i<height ; i++) {
				line = in.readLine().split(" ");
				for(j=0 ; j<weight ; j++) {
					land[i][j] = Integer.parseInt(line[j]);
				}
			}
			
			for(i=0 ; i<height ; i++)
				for(j=0 ; j<weight ; j++)
					if(land[i][j]>0){
						count++;
						search(i,j);
					}
					result.append(count+"\n");
		}
		out.write(result.toString());
		out.close(); in.close();
	}

	
	private static void search(int x, int y) {
		land[x][y]=0;
		int i ;
		int ax[] = {0,1,1,1,0,-1,-1,-1};
		int ay[] = {1,1,0,-1,-1,-1,0,1};
		int dx,dy;
	}
	
	
	
}
