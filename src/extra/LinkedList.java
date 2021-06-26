package extra;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

public class LinkedList {
	public static void main (String args[]) {
		Node head = new Node(4);
		Node nodeB = new Node(2);
		Node nodeC = new Node(3);
		Node nodeD = new Node(10);
		
		// linked list head--B--C--D
		
		head.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println("total nodes = " +countNodes(head));
		
	}
	
	static int countNodes(Node head) {
		
		int i=1;
		
		while (head.next != null) {
			i++;
			head = head.next;
		}
		
		return i;
	}
}
