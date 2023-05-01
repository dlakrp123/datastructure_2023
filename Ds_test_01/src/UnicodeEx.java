
public class UnicodeEx {
	public static void main(String[] args) {
		System.out.println(Integer.toHexString('A'));
		System.out.println(Integer.toHexString('가'));
		System.out.println(Integer.toHexString('金'));
		
		System.out.println("홍 길 동을 유니코드로 변환: ");
		System.out.println(Integer.toHexString('홍'));
		System.out.println(Integer.toHexString('길'));
		System.out.println(Integer.toHexString('동'));
	}
}
