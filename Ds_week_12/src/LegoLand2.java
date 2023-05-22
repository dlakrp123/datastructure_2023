import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Customer2 {
	int id;
	int token; // 구매한 입장료 액수

	public Customer2(int id, int token) {
		this.id = id;
		this.token = token;
	}

	public String toString() {
		return id + " " + token;
	}
}

public class LegoLand2 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int nCustomers = 10;
		int token;
		int serveTime = 0;
		int tmpId;
		int tmpToken;
		int minute = 0;

		Customer2 tmpCustomer = null;
		Queue<Customer2> ride1 = new LinkedList<Customer2>();
		// 고객생성후 큐에 추가
		for (int i = 0; i < nCustomers; i++) {
			token = (rd.nextInt(2)+1);
			ride1.add(new Customer2(i, token));
		}
		boolean flag = false;
		for (int i = 0; i <= 120 && flag == false ; i++) {
			
			if(minute > 60) {
				System.out.println(" current time : 10: " + (minute-60) + " min");
			}
			else
				System.out.println(" current time : 09: " + minute + " min");
			minute++;
			if (serveTime == 0) {
				// 큐에서 고객을 디큐
				// 큐에서 대기하는 고객 디큐
				if (minute != 1) {
					System.out.println(tmpCustomer.id + " customer " + tmpCustomer.token + " get off");
				}
				if(!ride1.isEmpty()) {
					if(ride1.peek().token == 1) {
						tmpCustomer = ride1.remove();
						System.out.println(tmpCustomer.id + " customer " + tmpCustomer.token + " get in");
						serveTime = 5;
					}
					else if(ride1.peek().token == 2) {
						tmpCustomer = ride1.remove();
						System.out.println(tmpCustomer.id + " customer " + tmpCustomer.token + " get in");
						serveTime = 10;
					}
				}else {
					flag = true;
				}
			}
			serveTime--;

		}
	}
}
