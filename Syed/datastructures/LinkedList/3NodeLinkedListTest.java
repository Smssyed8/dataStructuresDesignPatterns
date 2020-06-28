class LinkedList{

	Node head;

	static class Node{   // should be static class

		int data;  // data should be inside Node class
		Node next; 

		Node(int d){  ///no retun type to constructor is allowed
			data = d;  // keep seperate variables
			next = null;
		}

	}
	public void printList(){ 
		Node newN = head;    // check for brackets. part of parent class
		while(newN  != null){    // null
			System.out.println(newN.data);
			newN = newN.next;
		}
	}	

	public static void main(String args[]){
	

		LinkedList list = new LinkedList();
		list.head = new Node(1);   // new Node for head
		Node second = new Node(2);
		Node third = new Node(3);
	
		list.head.next = second; 
		second.next = third;
		list.printList();   // print
		}	

}



