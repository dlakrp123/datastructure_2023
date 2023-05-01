class Node2{
	String data;
	Node2 link;
	public Node2(String name) {
		data = name;
		link = null;
	}
}

public class Zero {
	public static void main(String[] args) {
		Node2 list1;
		list1 = new Node2("choi");
		list1.link = new Node2("kim");
		list1.link.link = new Node2("lee");
		list1.link.link.link = new Node2("park");
		list1.link.link.link.link = new Node2("yoo");
		
		System.out.println(list1.data);//임시포인터변수 사용 안함
		System.out.println(list1.link.data);
		System.out.println(list1.link.link.data);
		System.out.println(list1.link.link.link.data);
		System.out.println(list1.link.link.link.link.data);
		
		//임시포인터변수 사용
		Node2 p;
		System.out.println("임시포인터변수 사용");
		for(p = list1;p!=null;p=p.link) {
			System.out.print(" " + p.data);
		}
	}
}
