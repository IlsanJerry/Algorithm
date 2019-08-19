package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Recursion_1019_BookPage {
  
    private static int[] arr = new int[10];
    private static int location = 1;
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 36
        int start = 1;
        int end = n;
        
        while(start <= end) {    
            while(start%10!=0 && start<=end){
                cal(start);
                start++; 
            }
           
            if(start > end) break;             
            while(end%10!=9 && start<=end){
                cal(end);
                end--; 
            }    
            
            start /= 10;  
            end /= 10;  
            
            for(int i=0 ; i<10 ; i++) arr[i] += (end-start+1) * location;        
            location *= 10;  
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<10 ; i++) sb.append(arr[i] + " ");
        
        System.out.println(sb.toString());
    }
    
    public static void cal(int num){
        while(num > 0){
        	arr[num%10] += location;
            num /= 10;
        }
    }
}

