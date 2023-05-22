class Student{
	int id;
	String name;
	public Student(int id1, String name1) {
		this.id = id1;
		this.name = name1;
	}
}

interface Stack<E>{
	boolean isEmpty();
	public abstract void push(Object x);
	public abstract E pop();
	E peek();
}


class ArrayStack<E> implements Stack<E>{
	int top;
	int stackSize;
	Object[] itemArray;
	int increment;
	public ArrayStack() {
		top = -1;
		stackSize = 10;
		increment = 5;
		itemArray= new Object[stackSize];
	}
	
	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public void push(Object x) {
		if(top == stackSize-1) {
			stackFull();
		}
		top = top+1;
		itemArray[top] = x;
	}
	
	public void stackFull() {
		stackSize = stackSize + increment;
		Object[] tmpArray = new Object[stackSize];
		
		for(int i = 0 ; i<=top ; i++) {
			tmpArray[i] = itemArray[i];
		}
		itemArray = tmpArray;
	}
	
	@Override
	public E pop() {
		if(isEmpty()) {
			return null;
		}
		return (E) itemArray[top--]; //형변환
	}

	@Override
	public E peek() {
		if(isEmpty()) {
			return null;
		}
		return (E) itemArray[top--];
	}
	
}
public class GenericArrayStackMain {
	public static void main(String[] args) {
		ArrayStack<Student> stack3 = new ArrayStack<Student>();
		Student s1 = new Student(1, "Kim");
		Student tmpStudent;
		stack3.push(s1);
		stack3.push(new Student(2, "Lee"));
		stack3.push(new Student(3, "Park"));
		stack3.push(new Student(4, "Choi"));
		stack3.push(new Student(5, "Gang"));
		stack3.push(new Student(6, "Jeong"));
		
		tmpStudent = stack3.peek();
		System.out.println("peek : <" + tmpStudent.id + ", " + tmpStudent.name + ">");
		
	}
}
