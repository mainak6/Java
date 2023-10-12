# Double Linked list in Java
```java

class Node{
	int data;
	Node next;
	Node prev;

	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;

	}
}
class Linklist{
	Node head;
	void link(){
		while(head!=null){
			System.out.println(head.data);
			head = head.prev;
		}
	}
}
class A{
	public static void main(String args[]){
		Node l1 = new Node(30);
		Node l2 = new Node(33);
		Node l3 = new Node(46);

		l1.next=l2;
		l2.next=l3;
		l2.prev=l1;
		l3.prev=l2;
		
		Linklist h = new Linklist();
		h.head = l3;
		h.link();
		
	}
}


```