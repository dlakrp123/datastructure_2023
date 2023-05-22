import java.util.Stack;

public class QueueSim {
	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<>();
		stack1.push("Kim");
		stack1.push(stack1.pop());
		stack1.push("Lee");
		stack1.push("Park");
		stack1.push("Yoo");
		stack1.push("Hong");
		stack1.peek();
		
		Stack<String> stack2 = new Stack<>();
		/// dequeue();
		while(!stack1.isEmpty()) {
		stack2.push(stack1.pop());
		}
		System.out.println(stack2.pop());
		while(!stack2.isEmpty()) {
		stack1.push(stack2.pop());
		}

	}
}
