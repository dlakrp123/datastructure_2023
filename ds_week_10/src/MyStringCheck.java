import java.util.Stack;

public class MyStringCheck {
	public static boolean myStringCheck(String str) {
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == 'a') {
				stack1.push(str);
			} else if (c == 'b') {
				stack2.push(str);
			}
		}

		if (stack1.size() == stack2.size())// 동전통의 사이즈가 같으면 true 반환.
			return true;
		else
			return false;
	}

	public static boolean myStringCheck2(String str) {
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		Stack<String> stack3 = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == 'a') {
				stack1.push(str);
				stack1.push(str);
			} else if (c == 'b') {
				stack2.push(str);
			} else if (c == 'c') {
				stack3.push(str);
				stack3.push(str);
			}
		}
		while(!stack1.empty()) { //동전통이 비워질 때 까지 제거.
			if(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()) {
				return false;
			}
			stack1.pop();
			stack2.pop();
			stack3.pop();
		}
		
		if(stack1.isEmpty() && stack2.isEmpty() && stack3.isEmpty()) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		String str1, str2, str3;

		str1 = "aabb";
		str2 = "aaabb";
		str3 = "aaabbb";
		System.out.println(myStringCheck(str1));
		System.out.println(myStringCheck(str2));
		System.out.println(myStringCheck(str3) + "\n");
		
		str3 = "abbc";
		str1 = "aabbbbcc";
		str2 = "aaabbbbbccc";
		System.out.println(myStringCheck2(str3));
		System.out.println(myStringCheck2(str1));
		System.out.println(myStringCheck2(str2));
		
	}
}