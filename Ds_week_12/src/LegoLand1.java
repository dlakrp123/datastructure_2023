
import java.util.LinkedList;

import java.util.Queue;
import java.util.Random;

class Customer {
	int id;
	int token; // 구매한 입장료 액수

	public Customer(int id, int token) {
		this.id = id;
		this.token = token;
	}

	public String toString() {
		return id + " " + token;
	}
}

public class LegoLand1 {
	public static void main(String[] args) {
		System.out.println("Hello Java");

		int nCustomers = 10;
		int token = 1;
		int serveTime = 0;
		int tmpId;
		int tmpToken;
		int minute = 0;

		Customer tmpCustomer = null;
		Queue<Customer> ride1 = new LinkedList<Customer>();
		// 고객생성후 큐에 추가
		for (int i = 0; i < nCustomers; i++) {
			ride1.add(new Customer(i, token));
		}
		boolean flag = false;
		for (int i = 0; i <= 100 && flag == false ; i++) {
			System.out.println(" current time : 09: " + minute + "min");
			minute++;
			if (serveTime == 0) {
				// 큐에서 고객을 디큐
				// System.out.println(tmpCustomer+ " out");
				// System.out.println(tmpCustomer.id+" customer "+tmpCustomer.token+" get off");
				// 큐에서 대기하는 고객 디큐
				if (minute != 1) {
					System.out.println(tmpCustomer.id + " customer " + tmpCustomer.token + " get off");
				}
				if(!ride1.isEmpty()) {
					tmpCustomer = ride1.remove();
					serveTime = 5;
				}else {
					flag = true;
				}
			}
			serveTime--;

		}
	}
}
