import java.util.Random;


public class HallymCafe {
	public static void main(String[] args) {
		int n = 10, k = 60, c = 0, a = 0, o = 0, l = 0;
		Random rand1 = new Random();
		
		for(int i = 0; i<k; i++) {
			int x= rand1.nextInt(n);
			
			if(x<4) {
				System.out.println("주문 결과: 카페라떼");
				c++;
			}
			else if(4<=x && x<7) {
				System.out.println("주문 결과: 아메리카노");
				a++;
			}
			else if(7<=x && x<9) {
				System.out.println("주문 결과: 오렌지주스");
				o++;
			}
			else if(x>=9) {
				System.out.println("주문 결과: 콜라");
				l++;
			}
		}
		
		
		System.out.println("----------------------------------");
		System.out.println("-------------주문 결과---------------");
		System.out.println("손님 수: "+ k);
		System.out.println("카페라떼 주문 수: " + c);
		System.out.println("아메리카노 주문 수: " + a);
		System.out.println("오렌지주스 주문 수: " + o);
		System.out.println("콜라 주문 수: " + l);
		
	}
}
