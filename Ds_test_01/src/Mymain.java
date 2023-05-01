class A1{
	int getSum(int a, int b) {
		return a+b;
	}
	int getAvg(int a, int b) {
		return (a+b)/2;
	}
}
public class Mymain {
	public static void main(String[] args) {
		A1 a1 = new A1();
		
		System.out.println("sum: " + a1.getSum(100, 200));
		System.out.println("avg: " + a1.getAvg(100, 200));
	}
}
