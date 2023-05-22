import java.util.Scanner;
import java.util.Stack;

class Vehicle {
	int num;
	int money;
	boolean checkVIP;
	
	Vehicle(int num) {
		this.num = num;
		this.money = 5000;
		this.checkVIP = false;
		
		if(num == 2233 || num == 4543) {
			checkVIP = true;
		}
	}
}

public class ParkingLot_0 {
	static Stack<Vehicle> parking_A = new Stack<Vehicle>();
	static Stack<Vehicle> parking_B = new Stack<Vehicle>();

	static void park(Vehicle num) {
		parking_A.push(num);
	}

	static void unpark(int num) {
		while (!parking_A.empty()) {
			if (parking_A.peek().num == num) {
				CalculateParkingFee(parking_A.peek());
				parking_A.pop();
			} else {
				parking_B.push(parking_A.pop());
			}
		}
		while (!parking_B.empty()) {
			parking_A.push(parking_B.pop());
		}
	}

	static void Parking_A_print() {
		int parkNum = 10;
		System.out.println("ㅡㅡㅡㅡ현재 A 주차장 ㅡㅡㅡㅡㅡ");
		while (!parking_A.empty()) {
			System.out.println("<" + parkNum + "> " + parking_A.peek().num);
			parking_B.push(parking_A.pop());
			parkNum--;
		}
		while (!parking_B.empty()) {
			parking_A.push(parking_B.pop());
		}
	}

	static void setParking(int input) {
		Stack<Vehicle> tempStack = new Stack<Vehicle>();
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		if (input == 1) {
			if (parking_A.size() >= 10) {
				System.out.println("현재 주차장이 가득 찼습니다.");
				System.out.println();
			} else {
				Parking_A_print();
				System.out.println();
				System.out.println("총 " + parking_A.size() + "대의 차가 있습니다.");
				System.out.print("차 번호를 입력해주세요 >> ");
				int number = sc.nextInt();
				park(new Vehicle(number));
			}
		} else if (input == 2) {
			Parking_A_print();
			System.out.print("차 번호를 입력해주세요 >> ");
			int number = sc.nextInt();
			while (!parking_A.isEmpty()) {
				if (parking_A.peek().num == number) {
					unpark(number);
					found = true;
					System.out.println();
					break;
				} 
				tempStack.push(parking_A.pop());
			}
			while(!tempStack.empty()) {
				parking_A.push(tempStack.pop());
			}
			if(!found) {
				System.out.println("차량 번호 : " + number + " 는 없습니다.");
			}
		}
	}
	
	static void CalculateParkingFee(Vehicle vehicle) {
		int feeOfVIP = 2000;
		int feeOfRegular = 5000;
		
		if(vehicle.checkVIP == true) {
			System.out.println("Vehicle number " + vehicle.num + 
					" -> Pay " + feeOfVIP + " won as a VIP customer");
			if(vehicle.money < feeOfVIP) {
				System.out.println("Payment failed! (current balance : " + 
						vehicle.money + ") -> Accumulated postpayment costs : " +
						feeOfVIP);
			}
			else System.out.println("Payment completed (current balance : " + 
					(vehicle.money - feeOfVIP) + ")");
		}
		else {
			System.out.println("Vehicle number " + vehicle.num+ 
				" -> Pay " + feeOfRegular + " won as a regular customer");
			if(vehicle.money < feeOfRegular) {
				System.out.println("Payment failed! (current balance : " + 
						vehicle.money + ") -> Accumulated postpayment costs : " +
						feeOfRegular);
			}
			else System.out.println("Payment completed (current balance : " + 
					(vehicle.money - feeOfRegular) + ")");
		}
	}

	public static void main(String[] args) {

		parking_A.push(new Vehicle(2233));
		parking_A.push(new Vehicle(4543));
		parking_A.push(new Vehicle(3234));
		parking_A.push(new Vehicle(2299));
		parking_A.push(new Vehicle(3952));
		parking_A.push(new Vehicle(6456));

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("주차를 하시러면 1번 , 차를 출고 하려면 2번을 눌러주세요");
			System.out.println("프로그램 종료는 3번을 눌러주세요.");
			System.out.println();
			int parking_q = sc.nextInt();

			setParking(parking_q);

			if (parking_q == 3) {
				break;
			}
		}

	}
}
