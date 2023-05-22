import java.util.Queue;
import java.util.LinkedList;

public class FibQueue {

	public static void main(String[] args) {
		
		Queue<Integer> FibQ = new LinkedList<Integer>();
		FibQ.add(0);
		FibQ.add(1);
		int n=10;
		int x;
		for(int i=1;i<=n;i++) {
			x=FibQ.poll()+FibQ.peek();
			FibQ.add(x);
			System.out.println("Fib("+ i+")="+FibQ.peek());
		}
	}
}
