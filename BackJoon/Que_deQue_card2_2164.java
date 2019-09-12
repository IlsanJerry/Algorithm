package BackJoon;

import java.util.Deque;
import java.util.ArrayDeque;
import java.io.*;

public class Que_deQue_card2_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
         
        Deque<Integer> dq = new ArrayDeque<>();
        //ArrayDeque대신 LinkedList도 가능 
        //https://manzoo.tistory.com/83참고.
        
        for (int i = 1; i <= N; i++) dq.offer(i);
         
        while (dq.size() > 1) {
            dq.poll();    
            if (!dq.isEmpty()) dq.offer(dq.poll());
        }      
        System.out.println(dq.element());
    }
}