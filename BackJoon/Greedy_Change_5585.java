package BackJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Greedy_Change_5585 {
    private static BufferedWriter bw = 
    		new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000 - (Integer.parseInt(br.readLine()));
        
        int all_coin[] = {500,100,50,10,5,1};
        int rest = 0;
        for (int i=0; i<6; i++) {
        	rest += money / all_coin[i];
            money -= (money / all_coin[i]) * all_coin[i];
        }
        bw.write(String.valueOf(rest));
        bw.flush();
    }
}