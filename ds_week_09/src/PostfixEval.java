import java.util.Stack;

public class PostfixEval {
	public static int evaluate(String exp) {
		Stack<Integer> stack1 = new Stack<>();
		for(String token : exp.split("\\s+")){
			if(token.matches("\\d+")) {
				stack1.push(Integer.parseInt(token));
			}
			else {
				int op1 = stack1.pop();
				int op2 = stack1.pop();
				if(token.equals("+")) {
					stack1.push(op2 + op1);
				}
				else if(token.equals("-")){
					stack1.push(op2 - op1);
				}
				else if(token.equals("*")) {
					stack1.push(op2*op1);
				}
				else if(token.equals("/")) {
					stack1.push(op2/op1);
				}
			}
		}
		return stack1.pop();
	}
	public static void main(String[] args) {
		String expression = "3 14 + 5 * 6 -";
		System.out.println(evaluate(expression));
	}
}
 