package LinkedList;

public class LinkedList implements LinkedListMethod{

	@Override
	public void addNode(Node head,int d) {
		// TODO Auto-generated method stub
		Node newNode=new Node(d);
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = newNode;
	}

	@Override
	public int length(Node head) {
		// TODO Auto-generated method stub
		int length = 0;
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
			length++;
			
		}
		return length;
	}

}
