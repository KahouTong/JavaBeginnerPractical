package extra;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	
	Node1(int data){
		this.data=data;
	}
}

public class Tree {
	
	public static void main (String args[]) {
		Node1 root = new Node1(2);
		Node1 child1 = new Node1(3);
		Node1 child2 = new Node1(4);
		Node1 child3 = new Node1(5);
		Node1 child4 = new Node1(6);
		
		//tree 2 --> 3 ,4 ; 3 --> 5,6
		
		root.left = child1;
		root.right = child2;
		child1.left = child3;
		child1.right = child4;
		
		System.out.println("sum of all node: "+find_sum(root));
	}
	
	static int find_sum(Node1 root) {
		
		if (root == null) {
			return 0;
		}
		
		else 
			return root.data + find_sum(root.left) + find_sum(root.right);
	}

}
