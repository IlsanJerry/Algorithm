package BackJoon;

import java.util.Scanner;

public class DP_Partial_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int max = 0; 
        int[] d = new int[1001];  
        int[] a = new int[1001];
         
        for(int i = 1; i <= length; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i = 1; i <= length; i++) {
            int min = 0;
            for(int j = 0; j <= i; j++) {  
                if(a[j] > a[i]) {
                    if(min < d[j]) min = d[j];
                }
            }
            d[i] = min + 1;
            if(max < d[i]) max = d[i]; 
        }
        System.out.println(max);
        
    }
}