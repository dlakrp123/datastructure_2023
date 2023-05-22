import java.util.Stack;

public class InfixToPostfix {
	static int prec(char ch) {
		if((ch=='-')||(ch=='+')) {return 1;}
		if((ch=='*')||(ch=='/')) {return 2;}
		if(ch=='^') {return 3;}
		return -1;
	}
	public static String infixToPostfix(String exp) {
		String result = new String("");
		Stack<Character> stack = new Stack<>();
		
		for(char c : exp.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				result = result+c;
			}
			else if(c=='(') {
				stack.push(c);
			}
			else if(c==')') {
				while((!stack.isEmpty())&&(stack.peek()!=('('))) {
					result = result+stack.pop();
				}
				stack.pop();
			}
			else {
				while((!stack.isEmpty())&&(prec(c)<=prec(stack.peek()))) {
					result=result+stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			result = result + stack.pop();
		}
		return result;
	}
	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
		System.out.println(infixToPostfix(exp));
	}
}
