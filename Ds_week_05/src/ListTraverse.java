class Node4{
	int data;
	Node4 link;
	
	public Node4() {
		this.data = 0;
		this.link = null;
	}
	public Node4(int d) {
		this.data = d;
		this.link = null;
	}
}
public class ListTraverse {
	public static void main(String[] args) {
		Node4 list2, tmpNode;
		int count = 0;
		tmpNode = new Node4(15);
		list2 = tmpNode;
		tmpNode.link = new Node4(30);
		tmpNode = tmpNode.link;
		tmpNode.link = new Node4(80);
		tmpNode = tmpNode.link;
		tmpNode.link = new Node4(150);
		tmpNode = tmpNode.link;
		tmpNode.link = new Node4(200);
		tmpNode = tmpNode.link;
		
		for(tmpNode = list2 ; tmpNode != null ; tmpNode = tmpNode.link) {
			count++;
			System.out.print(tmpNode.data + " ");
		}
		System.out.println();
		System.out.println("원소의 갯수 : " + count);
	}
}
