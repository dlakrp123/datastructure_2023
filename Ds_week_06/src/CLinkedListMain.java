class Node2{
	Node2 next;
	int data;
	
	public Node2(int n) {
		this.data = n;
		this.next = null;
	}
}

class CLinkedList{
	Node2 tail;
	public void addLast(int data) {
		Node2 tmpnode;
		tmpnode = new Node2(data);
		if(tail == null) {
			tail = tmpnode;
			tmpnode.next = tail; 
		}else {
			tmpnode.next = tail.next;
			tail.next = tmpnode;
			tail = tmpnode;
		}
	}
	public void printList() {
		Node2 p = tail.next;
		do {
			System.out.print(p.data + " ");
			p = p.next;
		}while(p != tail.next);
		System.out.println();
	}
	public final int getNoofNode() {
		int count = 0;
		Node2 p = tail.next;
		do {
			count++;
			p = p.next;
		}while(p != tail.next);
		return count;
	}
	public boolean findData(int n) {
		Node2 p = tail.next;
		do {
			p = p.next;
			if(p.data == n)
				return true;
			else
				return false;
		}while(p != tail.next);
		
	}
}
public class CLinkedListMain {
	public static void main(String[] args) {
		CLinkedList clist1 = new CLinkedList();
		clist1.addLast(1);
		clist1.addLast(2);
		clist1.addLast(3);
		clist1.addLast(4);
		clist1.addLast(5);
		
		clist1.printList();
		
		System.out.println("원소의 갯수 : " + clist1.getNoofNode());
		
		System.out.println(clist1.findData(2));
		System.out.println(clist1.findData(6));
	}
}
