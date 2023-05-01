
class Node{
	String data;
	Node next;
	public Node(String s) {
		data = s;
		next = null;
	}
}

public class ClinkedListBasic {
	public static void main(String[] args) {
		Node tmpNode, p;
		Node tail;
		int count = 0;
		
		// Clist = {"apple", "strawberry", "orange", "banana", "melon"}
		tmpNode = new Node("apple");
		tail = tmpNode;
		tail.next = tail;
		
		tmpNode = new Node("strawberry");
		tmpNode.next = tail.next;
		tail.next = tmpNode;
		tail = tmpNode;
		
		tmpNode = new Node("orange");
		tmpNode.next = tail.next;
		tail.next = tmpNode;
		tail = tmpNode;

		tmpNode = new Node("banana");
		tmpNode.next = tail.next;
		tail.next = tmpNode;
		tail = tmpNode;

		tmpNode = new Node("melon");
		tmpNode.next = tail.next;
		tail.next = tmpNode;
		tail = tmpNode;
		
		p = tail.next;
		do {
			System.out.print(p.data + " ");
			p = p.next;
		} while(p != tail.next);
		System.out.println();
		
		// 선두에 "pineapple" 추가
		tmpNode = new Node("pineapple");
		tmpNode.next = tail.next;
		tail.next = tmpNode;
		
		p = tail.next;
		do {
			System.out.print(p.data + " ");
			p = p.next;
		} while(p != tail.next);
		System.out.println();
		
		// "durian" 추가
		tmpNode = new Node("durian");
		tmpNode.next = tail.next;
		tail.next = tmpNode;
		tail = tmpNode;
		
		p = tail.next;
		do {
			System.out.print(p.data + " ");
			p = p.next;
		} while(p != tail.next);
		System.out.println();
		
		// 선두 원소 제거
		tmpNode = tail.next;
		tmpNode = tmpNode.next;
		tail.next = tmpNode;
		
		p = tail.next;
		do {
			System.out.print(p.data + " ");
			p = p.next;
		} while(p != tail.next);
		System.out.println();
		
		// 마지막 원소 제거
		tmpNode = tail.next;
		do {
			tmpNode = tmpNode.next;
		}while(tmpNode.next != tail);
		
		tmpNode.next = tail.next;
		tail = tmpNode;
		
		p = tail.next;
		do {
			System.out.print(p.data + " ");
			p = p.next;
		} while(p != tail.next);
		System.out.println();
	}
}
