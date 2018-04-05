package LinkedList;

public class TestLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node();
		LinkedList ls = new LinkedList();
		ls.addNode(head, 2);
		ls.addNode(head, 3);
		ls.addNode(head, 4);
		ls.addNode(head, 5);
		ls.addNode(head, 6);
		System.out.println(ls.length(head));
		System.out.println(head.val);
	}

}
