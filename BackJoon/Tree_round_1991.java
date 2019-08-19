package BackJoon;

import java.util.*;
import java.io.*;

public class Tree_round_1991 {
	private static BufferedWriter bw = 
			new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		tree = new Node[n];
		
		for (int i=0 ; i<n ; i++) {
			tree[i] = new Node((char) ('A' + i));
		}
		
		for (int i=0 ; i<n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char root = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			if (left != '.')
				tree[root - 'A'].l = tree[left - 'A'];
			if (right != '.')
				tree[root - 'A'].r = tree[right - 'A'];
		}
		preorder(0); bw.write("\n");
		inorder(0); bw.write("\n");
		postorder(0); bw.write("\n");
		
		bw.flush();
	}

	
	static class Node {
		public Node l, r;
		public char c;

		public Node(char c) {
			this.c = c;
		}
	}

	private static Node tree[];
		
	private static void preorder(int idx) throws IOException {
		bw.write(tree[idx].c);
		if (tree[idx].l != null)
			preorder(tree[idx].l.c - 'A');
		if (tree[idx].r != null)
			preorder(tree[idx].r.c - 'A');
	}

	private static void inorder(int idx) throws IOException {
		if (tree[idx].l != null)
			inorder(tree[idx].l.c - 'A');
		bw.write(tree[idx].c);
		if (tree[idx].r != null)
			inorder(tree[idx].r.c - 'A');
	}

	private static void postorder(int idx) throws IOException {
		if (tree[idx].l != null)
			postorder(tree[idx].l.c - 'A');
		if (tree[idx].r != null)
			postorder(tree[idx].r.c - 'A');
		bw.write(tree[idx].c);
	}
}
