
public class StringComp {
	public static void main(String[] args) {
		String s1 = "Hallym";
		String s2 = "Hallym";
		String s3 = new String("Hallym");
		String s4 = "Hanlim";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		if(s1.equals(s4)) 
			System.out.println("s1 and s2 are same strings");
		else 
			System.out.println("s1 and s2 are not same strings");
		
		//여기서부터 compare 구문입니다.
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
		if(s1.compareTo(s4) == 0) 
			System.out.println("s1 and s2 are same strings");
		else 
			System.out.println("s1 and s2 are not same strings");
		
		}
	
	}
