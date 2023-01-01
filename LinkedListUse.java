package uni.linkedlist;

public class LinkedListUse {
	
	
	static public Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		Node<Integer> n4 = new Node<Integer>(40);
		Node<Integer> n5 = new Node<Integer>(60);
		Node<Integer> n6 = new Node<Integer>(70);
		
		n1.next =n2;
		System.out.println("n1"+"\t"+n1+"\t"+"data"+"\t"+n1.data+"\t"+"n1.next"+"\t"+n1.next);
		n2.next=n3;
		System.out.println("n2"+"\t"+n2+"\t"+"data"+"\t"+n2.data+"\t"+"n2.next"+"\t"+n2.next);
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		
		return n1 ;
	}
	
	// if there is no data to print, then head.next does give null pointer exception
	static public void printLinkedList(Node<Integer> head) {
		System.out.println();
		while(head!= null) {
			System.out.print(head.data+" ");
			head= head.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head = createLinkedList();
		System.out.println(head);
		printLinkedList(head);
		
		
	}

}
