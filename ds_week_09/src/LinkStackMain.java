interface Stack{
	boolean isEmpty();
	public abstract void push(Object x);
	public abstract Object pop();
	Object peek();
}

class Node{
	Object data;
	Node link;
	Node(Object data){
		this.data = data;
		this.link = null;
	}
}
class LinkStack implements Stack{
	public Node top;
	public boolean isEmpty() {
		return (top==null);
	}
	public void push(Object data) {
		Node newNode = new Node(data);
		newNode.link = top;
		top=newNode;
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
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		else {
			return top.data;
		}
	}
}
public class LinkStackMain {
	public static void main(String[] args) {
		LinkStack stack1 = new LinkStack();
		
		stack1.push("kim");
		stack1.push("lee");
		stack1.push("park");
		stack1.push("song");
		
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
	}
}
