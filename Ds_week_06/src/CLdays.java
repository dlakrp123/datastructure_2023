
class Node3{
	String data;
	Node3 next;
	public Node3(String s) {
		data = s;
		next = null;
	}
}
class CLinkedList2{
	Node3 tail;
	public void addLast(String data) {
		Node3 tmpnode;
		tmpnode = new Node3(data);
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
		Node3 p = tail.next;
		do {
			System.out.print(p.data + " ");
			p = p.next;
		}while(p != tail.next);
	}
}
public class CLdays {
	public static void main(String[] args) {
		CLinkedList2 clist2 = new CLinkedList2();
		
		clist2.addLast("월");
		clist2.addLast("화");
		clist2.addLast("수");
		clist2.addLast("목");
		clist2.addLast("금");
		clist2.addLast("토");
		clist2.addLast("일");
		
		clist2.printList();
	}
}
