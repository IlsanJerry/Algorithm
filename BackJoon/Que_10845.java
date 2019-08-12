package BackJoon;

import java.io.*;

public class Que_10845 {
	public static void main(String args[]) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder SB = new StringBuilder();

		int n = Integer.parseInt(bf.readLine());
		Queue queue = new Queue(n);

		while (n-- > 0) {
			String[] input = bf.readLine().split(" ");

			if (input[0].equals("push")) {
				queue.push(Integer.parseInt(input[1]));
			} else if (input[0].equals("pop")) {
				SB.append(queue.pop() + "\n");
			} else if (input[0].equals("size")) {
				SB.append(queue.size() + "\n");
			} else if (input[0].equals("empty")) {
				SB.append(queue.empty() + "\n");
			} else if (input[0].equals("front")) {
				SB.append(queue.front() + "\n");
			} else if (input[0].equals("back")) {
				SB.append(queue.back() + "\n");
			}
		}
		System.out.println(SB);
	}

	static class Queue {
		private int[] array;
		private int rear;
		private int item;

		public Queue(int size) {
			rear = -1;
			array = new int[size];
		}

		public void push(int item) {
			array[++rear] = item;
		}

		public int pop() {
			if (rear == -1) {
				return -1;
			} else {
				item = array[0];
				for (int i = 0; i < rear; i++) {
					array[i] = array[i + 1];
				}
				rear--;
				return item;
			}
		}

		public int size() {
			return rear + 1;
		}

		public int empty() {
			if (rear == -1) {
				return 1;
			} else {
				return 0;
			}
		}

		public int front() {
			if (rear == -1) {
				return -1;
			}
			return array[0];
		}

		public int back() {
			if (rear == -1) {
				return -1;
			}
			return array[rear];
		}
	}
}