
class Node{
	public String name;
	public Node link;
	public Node() {
		this.name = null;
		this.link = null;
	}
	public Node(String name) {
		this.name = name;
		this.link = null;
	}
	public Node(String name, Node link) {
		this.name = name;
		this.link = link;
	}
}

class LinkedList{
	Node head , tail;
	public LinkedList() {
		this.head = null;
	}
	public void addLastNode(String name) {
		Node newNode = new Node(name);
		if(head == null) {
			this.head = newNode;
			this.tail = newNode;
		}
		else {
			Node tmpNode = head;
			while(tmpNode.link != null)
				tmpNode = tmpNode.link;
			tmpNode.link = newNode;
		}
	}
	public void insertMiddleNode(Node pre, String name) {
		Node newNode = new Node(name);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	public Node searchNode(String data) {
		Node tmpNode = this.head;
		while(tmpNode!= null) {
			if(data == tmpNode.name)
				return tmpNode;
			else
				tmpNode = tmpNode.link;
		}
		return tmpNode;
	}
	public void deleteLastNode() {
		Node tmpNode = head;
		Node pre = null;
		if(head.link == null)
			head = null;
		while(tmpNode.link != null) {
			pre = tmpNode;
			tmpNode = tmpNode.link;
			}
		pre.link = null;
	}
	public void deleteFirstNode() {
		head = head.link;
	}
	public void printList() {
		for(Node tmpNode = head ; tmpNode!=null ; tmpNode = tmpNode.link) {
			System.out.print(tmpNode.name + " ");
		}
		System.out.println();
	}
	public void replace(String x, String y) {
		for(Node tmpNode = head ; tmpNode!=null ; tmpNode = tmpNode.link) {
			if(tmpNode.name.equals(x)) {
				tmpNode.name = y;
			}
		}
	}
}
public class LinkedLIstMain  {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		
		list1.addLastNode("Kim");
		list1.addLastNode("Lee");
		list1.addLastNode("Park");
		Node pre = list1.searchNode("Park");
		list1.insertMiddleNode(pre, "gang");
		list1.addLastNode("Choi");
		list1.printList();
		list1.replace("Kim", "Choi");
		list1.printList();
		list1.deleteLastNode();
		list1.deleteFirstNode();
		list1.printList();
	}
}
