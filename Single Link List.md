# Single Linked list in Java
```java

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next = null;
	}
}
class LinkList{
	Node list;
	void printNode(){
		//Node curr = list;
		while(list != null){
			System.out.print(list.data+"->");
			list = list.next;
		}
	}
}

class A{
	public static void main(String args[]){

		Node p1 = new Node(10);
		Node p2 = new Node(20);
		Node p3 = new Node(30);
		Node p4 = new Node(44);
		Node p5 = new Node(58);
		
		p1.next = p2;
		p2.next = p3;
		p3.next = p4; 
		p4.next = p5;

		LinkList li = new LinkList();
		li.list=p1;
		li.printNode();
	}
}
```