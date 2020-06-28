class LinkedList{

Node head;


static class Node{

int data;

Node next;

	Node(int d){
		data = d;
		next = null;
	}


	public void printList(){


	}

	public void printMid(){


	}

	public void push(int i){
		Node newNode = new Node(i);
		newNode.next = head;
		head = newNode;
	}


	public static void main(String args[]){
	LinkedList list = new LinkedList();

	for(int i = 5; i > 0 ; i--){
		list.push(i);
		list.printList();
		list.printMid();
	}

	}
}

}
