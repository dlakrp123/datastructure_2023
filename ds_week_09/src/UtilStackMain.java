import java.util.Stack;

class Student{
	int id;
	String name;
	public Student(int id1, String name1) {
		this.id = id1;
		this.name = name1;
	}
}

public class UtilStackMain {
	public static void main(String[] args) {
		Stack<Student> stack3 = new Stack<Student>();
		Student s1 = new Student(1, "Kim");
		stack3.push(s1);
		stack3.push(new Student(2, "Lee"));
		stack3.push(new Student(3, "Park"));
		stack3.push(new Student(4, "Choi"));
		stack3.push(new Student(5, "Gang"));
		
		for(Student str : stack3) {
			System.out.printf("<%d , %s>", str.id, str.name);
			System.out.println();
		}
		System.out.println("스택내의 원소 갯수 : " + stack3.size());
		System.out.println("<1,Kim> 몇 번째 원소인지 출력 : " + stack3.search(s1));
		
		stack3.clear();
		stack3.pop();//Stack Underflow
	}
}
