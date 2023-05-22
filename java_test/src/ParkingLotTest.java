import java.util.Stack;
import java.util.Random;
import java.util.Scanner;

class Vehicle0 {
	int vehicleNum;
	int spaceNum;
	boolean checkVIP;
	int money;
	
	public Vehicle0(int vehicleNum) {
		this.vehicleNum = vehicleNum;
		this.spaceNum = 0;
		this.checkVIP = false;
		
		if((vehicleNum == 1004) || (vehicleNum == 1007)) {
			this.checkVIP = true;
		}
		Random randMoney = new Random();
		this.money = randMoney.nextInt(10) * 1000;
	}
}
public class ParkingLotTest {
	static int NumOfVehicles = 0;
	static int NumOfSpace = 10;
	static int NumOfEmptySpace = NumOfSpace - NumOfVehicles;
	
	static void vehicleIn(Stack<Vehicle0> area, Vehicle0 vehicle) {
		vehicle.spaceNum = NumOfEmptySpace;
		if(NumOfEmptySpace == 0) {
			System.out.println("차량 번호 " + vehicle.vehicleNum + 
					" -> 여유 공간이 없습니다");
		} else {
			area.push(vehicle);
			NumOfEmptySpace--; NumOfVehicles++;
		}
	}
	static void CalculateParkingFee(Vehicle0 vehicle) {
		int ParkingFeeOfVIP = 2000;
		int ParkingFeeOfRegular = 5000;
		
		if(vehicle.checkVIP == true) {
			System.out.println("차량 번호 " + vehicle.vehicleNum + 
					" VIP 고객이므로 " + ParkingFeeOfVIP + "원이 결제됩니다");
			if(vehicle.money < ParkingFeeOfVIP) {
				System.out.println("결제 실패! (현재 잔액 : " + 
						vehicle.money + ") -> 후불 청구 금액 : " +
						ParkingFeeOfVIP);
			} else {
				System.out.println("결제 완료 (현재 잔액 : " + 
						(vehicle.money - ParkingFeeOfVIP) + ")");
			}
		} else {
			System.out.println("차량 번호 " + vehicle.vehicleNum + 
				" 일반 고객이므로 " + ParkingFeeOfRegular + "원이 결제됩니다");
			if(vehicle.money < ParkingFeeOfRegular) {
				System.out.println("결제 실패! (현재 잔액 : " + 
						vehicle.money + ") -> 후불 청구 금액 : " +
						ParkingFeeOfRegular);
			} else {
				System.out.println("결제 완료 (현재 잔액 : " + 
						(vehicle.money - ParkingFeeOfRegular) + ")");
			}
		}
	}
	static void vehicleOut(Stack<Vehicle0> area, int vehicleNum) {
		Stack<Integer> Tmparea1 = new Stack<Integer>();
		Stack<Vehicle0> Tmparea2 = new Stack<Vehicle0>();
		boolean Exist;
		
		while(!area.empty()) {
			Tmparea1.push(area.peek().vehicleNum);
			Tmparea2.push(area.pop());
		}
		if(Tmparea1.contains(vehicleNum)) {
			Exist = true;
		} else {
			Exist = false;
		}
		while(!Tmparea2.empty()) {
			area.push(Tmparea2.pop());
		}
		if(Exist == false) {
			System.out.println("차량 번호 " + vehicleNum + "이(가) 존재하지 않습니다");
		} else if(Exist == true) {
			if(area.peek().vehicleNum == vehicleNum) {
				CalculateParkingFee(area.peek());
				System.out.println("차량 번호 " + vehicleNum + 
						"이(가) 정상적으로 출차 완료되었습니다");
				area.pop(); NumOfEmptySpace++; NumOfVehicles--;
			} else {
				while(area.peek().vehicleNum != vehicleNum) {
					Tmparea2.push(area.pop()); NumOfEmptySpace++; NumOfVehicles--;
				}
				CalculateParkingFee(area.peek());
				System.out.println("차량 번호 " + vehicleNum + 
						"이(가) 정상적으로 출차 완료되었습니다");
				area.pop(); NumOfEmptySpace++; NumOfVehicles--;
				while(!Tmparea2.empty()) {
					vehicleIn(area, Tmparea2.pop());
				}
			}
		}
	}
	static void Printarea(Stack<Vehicle0> area) {
		Stack<Vehicle0> Tmparea = new Stack<Vehicle0>();
		int tmpNumOfEmptySpace = NumOfEmptySpace;
		System.out.println("---- 주차장 A ----");
		while(tmpNumOfEmptySpace!= 0) {
			System.out.println("<" + (NumOfEmptySpace - --tmpNumOfEmptySpace) + 
					"> " + "비어있음");
		}
		while(!area.empty()) {
			System.out.println("<" + area.peek().spaceNum + "> " + area.peek().vehicleNum);
			NumOfEmptySpace++; NumOfVehicles--;
			Tmparea.push(area.pop());
		}
		while(!Tmparea.empty()) {
			vehicleIn(area, Tmparea.pop());
		}
		System.out.println("주차된 차량의 수 : " + NumOfVehicles);
		System.out.println("-----------------------");
	}
	public static void main(String[] args) {
		Stack<Vehicle0> areaA = new Stack<Vehicle0>();
		
		while(true) {
			System.out.print("주차를 원하시면 1번, 출차를 원하시면 2번, "
					+ "프로그램 종료를 원하시면 3번을 눌러주세요: ");
			
			Scanner sc = new Scanner(System.in);
			
			int NumEntered = sc.nextInt();
			if(NumEntered == 1) {
				System.out.print("주차할 차량 번호를 입력하세요 : ");
				int num1 = sc.nextInt();
				vehicleIn(areaA, new Vehicle0(num1));
				Printarea(areaA);
			} else if(NumEntered == 2) {
				System.out.print("출차할 차량 번호를 입력하세요 : \n");
				int num2 = sc.nextInt();
				vehicleOut(areaA, num2);
				Printarea(areaA);
			} else if(NumEntered == 3) {
				System.out.println("프로그램을 종료합니다");
				Printarea(areaA);
				break;
			} else {
				System.out.println("1 또는 2 또는 3을 입력하세요");
			}
		}
	}
}
