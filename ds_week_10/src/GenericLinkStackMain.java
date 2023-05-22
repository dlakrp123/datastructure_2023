//import java.util.Stack;
//
//interface Stack1<E> {
//	boolean isEmpty();
//	public abstract void push(E x);
//	public abstract E pop();
//	E peek();
//}
//
//class Student {	
//	String name;
//	int id;
//	public Student(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//}
//
//class Node<E> {
//	E data;
//	Node link;
//	public Node(E x) {
//		data = x;
//		link = null;
//	}
//}
//
//class LinkStack<E> implements Stack1<E>{
//	public Node<E> top;
//	
//	public boolean isEmpty() {
//		return (top == null);
//	}
//	public void push(E x) {	//insertFirst
//		Node newNode = new Node(x);
//		newNode.link = top;
//		top = newNode;
//	}
//	public E pop() {			//deleteFirst
//		if(isEmpty())
//			return null;
//		else {
//			E item = top.data;
//			top = top.link;
//			return item;
//		}	
//	}
//	public E peek() {
//		if(isEmpty()) 
//			return null;
//		else
//			return top.data;
//	}
//
//}
//
//public class GenericLinkStackMain {
//
//	public static void main(String[] args) {
//		LinkStack<Student> stack3 = new LinkStack<>();
//		Student s = new Student(1, "Kim");
//		stack3.push(s);
//		s = new Student(2, "Lee");
//		stack3.push(s);
//		s = new Student(3, "Park");
//		stack3.push(s);
//		s = new Student(4, "Chio");
//		stack3.push(s);
//		s = new Student(5, "Jang");
//		stack3.push(s);
//		s = new Student(6, "Kang");
//		stack3.push(s);
//		s = new Student(7, "Seo");
//		stack3.push(s);
//		s = new Student(8, "Lyu");
//		stack3.push(s);
//		s = new Student(9, "Ha");
//		stack3.push(s);
//		s = new Student(10, "Jeon");
//		stack3.push(s);
//		Student tmp = stack3.peek();
//		System.out.println(tmp.id + " " + tmp.name); 
//	
//	}
//
//}
