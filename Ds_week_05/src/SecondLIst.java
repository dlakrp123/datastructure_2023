
class ListNode{
	private String name;
	public ListNode link;
	public ListNode() {
		this.name = null;
		this.link = null;
	}
	public ListNode(String name) {
		this.name = name;
		this.link = null;
	}
	public ListNode(String name, ListNode link) {
		this.name = name;
		this.link = link;
	}
	public void printList(ListNode l) {
		ListNode tmpNode;
		for(tmpNode = l ; tmpNode != null ; tmpNode = tmpNode.link) {
			System.out.print(tmpNode.name + " ");
		}
	}
}

public class SecondLIst {
	public static void main(String[] args) {
		ListNode list2, tmpNode;
		
		tmpNode = new ListNode("Cho");
		list2 = tmpNode;
		tmpNode.link = new ListNode("Kim");
		tmpNode = tmpNode.link;
		tmpNode.link = new ListNode("Lee");
		tmpNode = tmpNode.link;
		tmpNode.link = new ListNode("Park");
		tmpNode = tmpNode.link;
		tmpNode.link = new ListNode("Yoo");
		
		list2.printList(list2);//원소 출력 함수 실행
	}
}
