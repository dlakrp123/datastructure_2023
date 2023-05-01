class Node5{
	String data;
	Node5 link;
	
	public Node5() {
		this.data = null;
		this.link =null;
	}
	public Node5(String d) {
		this.data = d;
		this.link = null;
	}
}
public class LinkedListBasic {
	public static void main(String[] args) {
		Node5 list2, tmpNode5;
		int count = 0;
		
		tmpNode5 = new Node5("apple");
		list2 = tmpNode5;
		tmpNode5.link = new Node5("strawberry");
		tmpNode5 = tmpNode5.link;
		tmpNode5.link = new Node5("orange");
		tmpNode5 = tmpNode5.link;
		tmpNode5.link = new Node5("banana");
		tmpNode5 = tmpNode5.link;
		tmpNode5.link = new Node5("melon");
		tmpNode5 = tmpNode5.link;
		
		//head에 pineapple 추가
		tmpNode5 = new Node5("pineapple");
		tmpNode5.link = list2;
		list2 = tmpNode5;
		for(tmpNode5 = list2 ; tmpNode5 !=null ; tmpNode5 = tmpNode5.link) {
		System.out.print(tmpNode5.data + " ");
		}
		System.out.println();
		//두번째 원소 제거
		tmpNode5 = list2;
		tmpNode5 = tmpNode5.link;
		list2.link = tmpNode5.link;
		for(tmpNode5 = list2 ; tmpNode5 != null ; tmpNode5 = tmpNode5.link) {
			System.out.print(tmpNode5.data + " ");
		}
		System.out.println();
		//list2의 원소의 개수 출력
		for(tmpNode5 = list2 ; tmpNode5 != null ;tmpNode5 = tmpNode5.link) {
			count++;
		}
		System.out.println("원소의 개수 : "+count);
		//list2 마지막에 "durian"추가
		
		// durian 노드 추가
		tmpNode5 = list2;
		while(tmpNode5.link != null) {
		    tmpNode5 = tmpNode5.link;
		}
		tmpNode5.link = new Node5("durian");

		// 연결 리스트 출력
		for(tmpNode5 = list2 ; tmpNode5 != null ; tmpNode5 = tmpNode5.link) {
		    System.out.print(tmpNode5.data + " ");
		}
	}
}
