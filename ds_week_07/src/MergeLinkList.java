class Node2 {
	int data;
	Node2 link;

	public Node2(int n) {
		data = n;
		link = null;
	}
}

class LinkedList2 {
	Node2 head;
	Node2 tail;

	public void addLast(int data) {
		Node2 tmpNode = new Node2(data);

		if (head == null) {
			head = tmpNode;
			tail = tmpNode;
		} else {
			tail.link = tmpNode;
			tail = tmpNode;
		}
	}

	public void mergeList(LinkedList2 a, LinkedList2 b) {// 리스트1, 리스트2를 오름차순으로 합병하는 멤버함수 선언
		Node2 aCurrnet, bCurrent;
		aCurrnet = a.head;
		bCurrent = b.head;

		while (aCurrnet != null && bCurrent != null) {
			if (aCurrnet.data < bCurrent.data) {
				addLast(aCurrnet.data);
				aCurrnet = aCurrnet.link;
			} else {
				addLast(bCurrent.data);
				bCurrent = bCurrent.link;
			}
		}
		while (aCurrnet != null) {
			addLast(aCurrnet.data);
			aCurrnet = aCurrnet.link;
		}
		while (bCurrent != null) {
			addLast(bCurrent.data);
			bCurrent = bCurrent.link;
		}

	}

	public void printList() {
		for (Node2 tmpNode = head; tmpNode != null; tmpNode = tmpNode.link) {// 리스트 원소를 반복문으로 출력
			System.out.print(tmpNode.data + " ");
		}
		System.out.println();
	}

	public void printListRecursive(Node2 tmpNode) {//리스트원소를 재귀문으로 출력.
		if (tmpNode == null) {
			return;
		}
		System.out.print(tmpNode.data + " ");
		printListRecursive(tmpNode.link);
		if(tmpNode.link == null)
			System.out.println();
	}
}

public class MergeLinkList {
	public static void main(String[] args) {
		LinkedList2 list1 = new LinkedList2();
		LinkedList2 list2 = new LinkedList2();
		LinkedList2 list3 = new LinkedList2();// 병합시킬 새로운 리스트

		list1.addLast(10);
		list1.addLast(40);
		list1.addLast(100);
		list1.addLast(122);

		list2.addLast(15);
		list2.addLast(30);
		list2.addLast(80);
		list2.addLast(150);
		list2.addLast(200);

		list3.mergeList(list1, list2);
		
		System.out.println("반복문으로 원소 출력");
		list1.printList();
		list2.printList();
		list3.printList();
		System.out.println("재귀문으로 원소 출력");
		list1.printListRecursive(list1.head);
		list2.printListRecursive(list2.head);
		list3.printListRecursive(list3.head);
	}
}
