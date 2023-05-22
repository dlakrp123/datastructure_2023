import java.util.Stack;

public class CheckBracket {
	public static boolean isValid(String s) {
		Stack<Character> stack1 = new Stack<>();
		char[] s2 = s.toCharArray();
		for(char c : s2) {
			if(c=='(') {
				stack1.push(c);
			}
			else if(c==')') {
				if(stack1.empty()) {
					return false;
				}
				else {
					if(stack1.pop() != '(') {
						return false;
					}
					else {
						System.out.println("짝이 맞음");
					}
				}
			}
			else
				System.out.println("괄호 이외의 문자입니다 : " + c);
		}
		if(!stack1.empty()) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1 = "(((()))))";
		System.out.println(isValid(s1));
	}
}
