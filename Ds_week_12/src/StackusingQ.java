import java.util.Queue;
import java.util.LinkedList;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Stack{
	Queue<Student> q1 = new LinkedList<Student>();
	public void push(Student x) {
		q1.add(x);
		for(int i = 0 ; i < q1.size() ; i++) {
			q1.add(q1.remove());
		}
	}
	public Student pop() {
		return q1.remove();
	}
	public Student peek() {
		return q1.peek();
	}
	public boolean isEmpty() {
		return q1.isEmpty();
	}
}
public class StackusingQ {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push(new Student(20195225, "이준수"));
		System.out.println("peek 사용: "+s1.peek().id + " " + s1.peek().name);
		Student tmpS = s1.pop();
		System.out.println("pop 사용: "+tmpS.id + " "+ tmpS.name);
		System.out.println("isEmpty : " + s1.isEmpty());
	}
}
