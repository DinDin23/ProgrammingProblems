import java.util.*;
import java.io.*;
	
public class AlienSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int numWords = in.nextInt();
		int count = 1;
		while (numWords != 0) {
			System.out.println("year " + count);
			String alphabet = in.next();
			HashMap<Character,Character> map = new HashMap<>();
			for (int i = 0; i < 26; i++) {
				map.put(alphabet.charAt(i), (char)(i+65));
			}
			HashMap<String, String> words = new HashMap<>();
			String firstWord = in.next();
			String firstCypher = cypher(map, firstWord);
			words.put(firstCypher,firstWord);
			Tree tree = new Tree(firstCypher,numWords);
			for (int i = 1; i < numWords; i++) {
				String word = in.next();
				String cypher = cypher(map,word);
				words.put(cypher, word);
				tree.add(cypher);
			}
			
			tree.inOrder(tree.head);
			for (int i = 0; i < numWords; i++) {
				System.out.println(words.get(tree.words[i]));
			}
			numWords = in.nextInt();
			count++;
		}
	}
	
	public static String cypher(HashMap<Character,Character> key, String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output += Character.toString(key.get(input.charAt(i)));
		}
		return output;
	}
}

class Tree {
	
	Node head;
	String[] words;
	int index;
	public Tree(String head, int num) {
		this.head = new Node(head);
		words = new String[num];
		index = 0;
	}
	
	public void add(String input) {
		Node parent = findParent(input,head);
		if (input.compareTo(parent.data) < 0) {
			parent.right = new Node(input);
		} else {
			parent.left = new Node(input);
		}
	}
	
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.right);
			words[index] = (node.data); index++;
			inOrder(node.left);
		}
	}
	
	public Node findParent(String str, Node head) {
		if (str.compareTo(head.data) >= 0 && head.left == null) {
			return head;
		} else if (str.compareTo(head.data) < 0 && head.right == null) {
			return head;
		} else {
			if (str.compareTo(head.data) >= 0) {
				return findParent(str, head.left);
			} else {
				return findParent(str, head.right);
			}
		}
	}
	
	class Node {
		String data;
		Node left, right;
		
		public Node(String data) {
			this.data = data;
			left = null; right = null;
		}
		
		public String toString() {
			return data;
		}
	}
}
