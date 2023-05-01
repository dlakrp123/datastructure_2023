class CNode{
	CNode link;
	String data;
	public CNode(String data) {
		this.data = data;
		this.link = null;
	}
}
class CList{
	CNode tail;
	public CList() {
		this.tail = null;
	}
	
	public void addLastNode(String data) {
		 CNode newNode = new CNode(data);
		 
		 if(tail == null) {
			 tail = newNode;
			 tail.link = newNode;
		 }
		 else {
			 newNode.link = tail.link;
			 tail.link = newNode;
			 tail = newNode;
		 }
	}
	public CNode searchNode(String data) {
		CNode tmpNode = tail.link;
		do {
			if(data.equals(tmpNode.data))
				return tmpNode;
			else
				tmpNode = tmpNode.link;
		}while(tmpNode != tail.link);
		return null;
	}
	public void deleteFirstNode() {
		if(tail == tail.link)
			tail = null;
		this.tail.link = this.tail.link.link;
	}
	public void deleteLastNode() {
		CNode pre = tail;
		CNode tmpNode = tail.link;
		
		do {
			pre = tmpNode;
			tmpNode = tmpNode.link;
		}while(tmpNode.link != tail.link);
		pre.link = tail.link;
	}
	public void printList() {
		CNode p = tail.link;
		
		do {
			System.out.print(p.data + " ");
			p = p.link;
		}while(p != tail.link);
		System.out.println();
	}
}
public class CListMain {
	public static void main(String[] args) {
		CList c1 = new CList();
		
		c1.addLastNode("Tony");
		c1.addLastNode("Brian");
		c1.addLastNode("James");
		c1.addLastNode("Ian");
		c1.addLastNode("Anthony");
		c1.printList();
		
		CNode find = c1.searchNode("Tony");
		if(find == null)
			System.out.println("X");
		else
			System.out.println(find.data);
		CNode find2 = c1.searchNode("Ryan");
		if(find2 == null)
			System.out.println("X");
		else
			System.out.println(find2.data);
		c1.deleteFirstNode();
		c1.deleteLastNode();
		c1.printList();
	}
}
