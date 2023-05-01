class Node {
	int data;
	Node link;
	public Node( int x) {
		data=x;
		link=null;
	}
}
public class MergeLinkedList {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		Node list1=null; //
		Node list2=null;
		Node list3=null;
		Node tail1=null;
		Node tail2=null;
		Node tail3=null;
		Node p1, p2, p3;
		int count=0;
		//list1=(10, 40,100, 122)
		list1= new Node(10); tail1= list1;
		tail1.link=new Node(40); tail1=tail1.link;
		tail1.link=new Node(100); tail1=tail1.link;
		tail1.link=new Node(122); tail1=tail1.link;
		//list2=(15, 30, 40,80,100,122,150);
		list2 = new Node(15); tail2=list2;
		tail2.link=new Node(30); tail2=tail2.link;
		tail2.link=new Node(50); tail2=tail2.link;
		tail2.link=new Node(80); tail2=tail2.link;
		tail2.link=new Node(90); tail2=tail2.link;
		tail2.link=new Node(130); tail2=tail2.link;	
		tail2.link=new Node(150); tail2=tail2.link;
		
		p1=list1; p2=list2; 
		while((p1!=null)&&(p2!=null)) {
			if(count==0) {//1
				count=1;
				if(p1.data<p2.data) {
					list3=new Node(p1.data); p1=p1.link;
				}else { 
					list3=new Node(p2.data); p2=p2.link;
				}
				tail3=list3;
			}else { //2~n
				count++;
				if(p1.data<p2.data) {
					tail3.link=new Node(p1.data); p1=p1.link;
				}else {
					tail3.link=new Node(p2.data); p2=p2.link;
				}
				tail3=tail3.link;
			}
		}
		if (p1==null) {
			while(p2!=null) {
				count++;
				tail3.link=new Node(p2.data); 
				p2=p2.link; tail3=tail3.link;
			}
		}else {
			while(p1!=null) {
				count++;
				tail3.link=new Node(p1.data); 
				p1=p1.link; tail3=tail3.link;
			}
		}
		System.out.println("count="+count);
		//list3를 출력하라.
	}
}
