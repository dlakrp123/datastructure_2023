class Node3{
	public String name;
	public Node3 link;
	public Node3() {
		this.name = null;
		this.link = null;
	}
	public Node3(String name) {
		this.name = name;
		this.link = null;
	}
	public Node3(String name, Node3 link) {
		this.name = name;
		this.link = link;
	}
}
public class ThirdList {
	public static void main(String[] args) {
		String arrList[] = {"Choi", "Kim", "Lee", "Park", "Yoo"};
		Node3 list3, tmpNode;
		int count = 0;
		tmpNode = new Node3("Choi");
		list3 = tmpNode;
		tmpNode.link = new Node3("Kim");
		tmpNode = tmpNode.link;
		tmpNode.link = new Node3("Lee");
		tmpNode = tmpNode.link;
		tmpNode.link = new Node3("Park");
		tmpNode = tmpNode.link;
		tmpNode.link = new Node3("Yoo");
		tmpNode = tmpNode.link;
		
		System.out.println("배열 : " +arrList[4]);
		
		for(tmpNode = list3 ; tmpNode != null ; tmpNode = tmpNode.link) {
			count++;
			if(count == 4)
				System.out.println("연결리스트 : "+tmpNode.name);
		}
	}
}
