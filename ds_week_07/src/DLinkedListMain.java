class DNode{
	String data;
	DNode llink;
	DNode rlink;
	public DNode(String data)
	{
		this.data = data;
		llink = null;
		rlink = null;
	}
}
class DLinkedList{
	DNode head,tail;
	public void insertLast(String data) {
		DNode newNode = new DNode(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		newNode.llink = tail;
		tail.rlink = newNode;
		tail = newNode;
	}
	public void insertFirst(String data) {
		DNode newNode = new DNode(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		newNode.rlink = head;
		this.head.llink = newNode;
		this.head = newNode;
	}
	public String deleteFirst() {//첫번째 원소 삭제
		String old;
		if(head == null)
			return "";
		if(head == tail) {
			old = head.data;
			head = null;
			tail = null;
			return old;
		}
		old = head.data;
		head = head.rlink;
		head.llink = null;
		return old;
	}
	
	public String deleteLast() { // 마지막 원소 삭제
		String old;
		if(head == null)
			return "";
		if(head == tail) {
			old = head.data;
			head = null;
			tail = null;
			return old;
		}
		old = tail.data;
		tail = tail.llink;
		tail.rlink = null;
		return old;
	}
	public void deleteNode(String data) {
		DNode old;
		old = head;
		if(head == null)
			return;
		if(head == tail)
			head =null;
		while(old != null) {
			if(old.data.equals(data)) {
				if(old == head) {
					head = old.rlink;
				}
				else if(old == tail) {
					tail = old.llink;
				}
				else {
					old.llink.rlink = old.rlink;
					old.rlink.llink = old.llink;
				}
					
			}
			old = old.rlink;
		}
		
	}
	public void printNode() {
		DNode temp;
		for(temp = head ; temp!= null ; temp = temp.rlink) {
			System.out.print(temp.data + " ");
			
		}
		System.out.println();
	}
}
public class DLinkedListMain {
	public static void main(String[] args) {
		DLinkedList dlist1 = new DLinkedList();
		
		dlist1.insertLast("Kim");
		dlist1.insertLast("Lee");
		dlist1.insertLast("Park");
		dlist1.insertLast("Gang");
		dlist1.insertLast("Choi");//마지막에 원소 대입
		dlist1.printNode();
		dlist1.insertFirst("Hong");//선두원소 대입
		dlist1.printNode();
		dlist1.deleteNode("Gang");//특정 원소를 삭제
		dlist1.printNode();
		
		dlist1.deleteFirst();
		dlist1.deleteLast();
		dlist1.printNode();
	}
}
