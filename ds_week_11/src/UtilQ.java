import java.util.Queue;
import java.util.LinkedList;

class Student {
	int id;
	String name;

	public Student(int i, String nam) {
		id = i;
		name = nam;
	}
}

public class UtilQ {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(10);
		System.out.println(q1.poll());
		Queue<String> q2 = new LinkedList<String>();
		q2.add("Kim");
		System.out.println(q2.peek());
		
		Queue<Student> q3 = new LinkedList<Student>();
		Student s1 = new Student(1, "kim");
		q3.add(s1);
		
		System.out.println(q3.peek().id + " " + q3.peek().name);
	}
}
