import java.util.Stack;

public class ReverseString {
    static String reverse(String org) {
        String str = "";

        Stack<Character> stack = new Stack<>();
        for (char c : org.toCharArray()) {
            stack.push(c);
        }

        while (!stack.empty()) {
            str += stack.pop();
        }

        return str;
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverse(str));
    }
}