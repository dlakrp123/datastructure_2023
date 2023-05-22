interface Stack{
	boolean isEmpty();
	public abstract void push(Object x);
	public abstract Object pop();
	Object peek();
}

class ArrayStack implements Stack{
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
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		return itemArray[top--];
	}

	@Override
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		return itemArray[top--];
	}
	
}
public class ArrayStackMain {
	public static void main(String[] args) {
		ArrayStack stack1 = new ArrayStack();
		stack1.push("Kim");
		stack1.push("Lee");
		stack1.push("Park");
		stack1.push("Song");
		stack1.push("Choi");
		
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop()); //underflow 발생
	}
	
}
