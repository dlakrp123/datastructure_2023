
public class ArraySwitch {
	public static void main(String[] args) {
		int x = 3, y = 5;
		int temp;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		temp = x;
		x=y;
		y= temp;
		
		System.out.println("Swap");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8,9};
		int[] arrtemp;
		System.out.print("a[] : " );
		for(int i = 0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("b[] : ");
		for(int i = 0 ; i<b.length ; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		arrtemp = a;
		a=b;
		b=arrtemp;
		System.out.println("SWap");
		System.out.print("a[] : ");
		for(int i = 0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("b[] : ");
		for(int i = 0 ; i<b.length ; i++) {
			System.out.print(b[i]+ " ");
		}
	}
}
