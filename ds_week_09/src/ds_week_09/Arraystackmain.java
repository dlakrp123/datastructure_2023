package ds_week_09;

interface Stack{
	boolean isEmpty();
	public abstract void push(Object x);
	public abstract Object pop();
	void remove();
	Object peek();
}

class ArrayStack implements Stack{
	int top;
	int stackSize;
	Object[] itemArray;
	int increment;
	public ArrayStack() {
		top = 1;
		stackSize = 10;
		increment = 5;
		itemArray = new Object[stackSize];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public void push(Object x) {
		if(top == stackSize-1) {
			stackFull();
		}
		top = top+1;
		itemArray[top]=x;
	}
	public void stackFull() {
		stackSize = stackSize + increment;
		Object[] tmpArray = new Object[stackSize];
		for(int i = 0;i<=top;i++) {
			tmpArray[i] = itemArray[i];
		}
		itemArray=tmpArray;
	}
	@Override
	public Object pop() {
		if(isEmpty()) {return null;}
		return itemArray[top--];
	}
	
	@Override
	public void remove() {
		
	}
	@Override
	public Object peek() {
		if(isEmpty()) {return null;}
		else {return itemArray[top];}
	}
}
public class Arraystackmain {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		ArrayStack stack1 = new ArrayStack();
		stack1.push("Kim");
		stack1.push("Lee");
		stack1.push("Park");
		stack1.push("Song");
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
	}
}
