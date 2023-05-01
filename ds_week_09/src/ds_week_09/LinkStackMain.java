package ds_week_09;

interface Stack{
	boolean isEmpty();
	public abstract void push(Object x);
	public abstract Object pop();
	void remove();
	Object peek();
}

class Node{
	Object data;
	Node link;
	public Node(Object x) {
		data = x;
		link = null;
	}
}

class LinkStack {
	public Node top;
	public boolean isEmpty() {
		return (top==null);
	}
	
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		else 
		{
			Object item = top.data;
			top = top.link;
			return item;
		}
	}
	
	public void remove() {
		
	}
	
	public Object peek() {
		
	}
	
}

public class LinkStackMain {
	public static void main(String[] args) {
		
	}
}

