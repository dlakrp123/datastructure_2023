
public class CommendlineTest {
	public static void main(String[] args) {
		int min;
		int[] intArgs = new int[args.length];
		
		for (int i = 0 ; i<args.length ; i++) {
			System.out.println(i+" "+args[i]);
		}
		min=0;
		for(int i =1 ; i < args.length ; i++) {
			if (args[min].compareTo(args[i])>0) {
				min=i;
			}
		}
		System.out.println("min(문자)=" + args[min]); 
		
		for (int i = 0 ; i<args.length; i++) {
			intArgs[i]=Integer.parseInt(args[i]);
			System.out.print(" " + i + " : " + intArgs[i]);
		}
		System.out.println();
		min = 0;
	
		for(int i =1 ; i < args.length ; i++) {
			if (intArgs[min]>intArgs[i]) {
				min=i;
			}
		}
		System.out.println("min(정수) =" + args[min]);
	}
}
