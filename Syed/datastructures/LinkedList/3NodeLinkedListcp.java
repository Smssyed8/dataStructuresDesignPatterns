class LinkedList{
Node head;

public class static Node{
int data;
Node next;
Node(int d){
data = d;
next = null;
}


public void printList(){
Node n = head;
while(n != null){
System.out.println(n.data);
n = n.next;
}

}
public class void main(String args[]){


	LinkedList list = new LinkedList();

	list.head = New Node(1);
	Node second = new Node(2);
	Node third = new Node(3);

	list.head.next = second;
	second.next = third;

	list.printList();
}


}



}
