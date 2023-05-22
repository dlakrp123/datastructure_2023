//import java.util.Stack;
//import java.util.Random;
//
//class Vehicle {
//	int vehicleNum;
//	int spaceNum;
//	boolean checkVIP;
//	int money;
//	
//	public Vehicle(int vehicleNum) {
//		this.vehicleNum = vehicleNum;
//		this.spaceNum = 0;
//		this.checkVIP = false;
//		
//		if((vehicleNum == 1004) || (vehicleNum == 1007)) {
//			this.checkVIP = true;
//		}
//		Random randMoney = new Random();
//		this.money = randMoney.nextInt(10) * 1000;
//	}
//}
//public class ParkingLot_1 {
//	static int NumOfVehicles = 0;
//	static int NumOfSpace = 10;
//	static int NumOfEmptySpace = NumOfSpace - NumOfVehicles;
//	
//	static void vehicleIn(Stack<Vehicle> area, Vehicle vehicle) {
//		vehicle.spaceNum = NumOfEmptySpace;
//		if(NumOfEmptySpace == 0) {
//			System.out.println("Vehicle number " + vehicle.vehicleNum + 
//					" -> There is no space left");
//		}
//		else {
//			area.push(vehicle);
//			NumOfEmptySpace--; NumOfVehicles++;
//		}
//	}
//	static void CalculateParkingFee(Vehicle vehicle) {
//		int ParkingFeeOfVIP = 2000;
//		int ParkingFeeOfRegular = 5000;
//		
//		if(vehicle.checkVIP == true) {
//			System.out.println("Vehicle number " + vehicle.vehicleNum + 
//					" -> Pay " + ParkingFeeOfVIP + " won as a VIP customer");
//			if(vehicle.money < ParkingFeeOfVIP) {
//				System.out.println("Payment failed! (current balance : " + 
//						vehicle.money + ") -> Accumulated postpayment costs : " +
//						ParkingFeeOfVIP);
//			}
//			else System.out.println("Payment completed (current balance : " + 
//					(vehicle.money - ParkingFeeOfVIP) + ")");
//		}
//		else {
//			System.out.println("Vehicle number " + vehicle.vehicleNum + 
//				" -> Pay " + ParkingFeeOfRegular + " won as a regular customer");
//			if(vehicle.money < ParkingFeeOfRegular) {
//				System.out.println("Payment failed! (current balance : " + 
//						vehicle.money + ") -> Accumulated postpayment costs : " +
//						ParkingFeeOfRegular);
//			}
//			else System.out.println("Payment completed (current balance : " + 
//					(vehicle.money - ParkingFeeOfRegular) + ")");
//		}
//	}
//	static void vehicleOut(Stack<Vehicle> area, int vehicleNum) {
//		Stack<Vehicle> Tmparea = new Stack<Vehicle>();
//		
//		while(area.peek().vehicleNum != vehicleNum) {
//			Tmparea.push(area.pop()); NumOfEmptySpace++; NumOfVehicles--;
//		}
//		CalculateParkingFee(area.peek());
//		area.pop(); NumOfEmptySpace++; NumOfVehicles--;
//		while(!Tmparea.empty()) {
//			vehicleIn(area, Tmparea.pop());
//		}
//	}
//	static void Printarea(Stack<Vehicle> area) {
//		Stack<Vehicle> Tmparea = new Stack<Vehicle>();
//		int TmpNumOfEmptySpace = NumOfEmptySpace;
//		
//		while(TmpNumOfEmptySpace != 0) {
//			System.out.println("<" + (NumOfEmptySpace - --TmpNumOfEmptySpace) + 
//					"> " + "null");
//		}
//		while(!area.empty()) {
//			Tmparea.push(area.peek());
//			System.out.println("<" + area.peek().spaceNum + "> " + area.pop().vehicleNum);
//			NumOfEmptySpace++; NumOfVehicles--;
//		}
//		while(!Tmparea.empty()) {
//			vehicleIn(area, Tmparea.pop());
//		}
//		System.out.println("Number of vehicles : " + NumOfVehicles);
//		System.out.println();
//	}
//	public static void main(String[] args) {
//		Stack<Vehicle> areaA = new Stack<Vehicle>();
//		
//		vehicleIn(areaA, new Vehicle(1001));
//		vehicleIn(areaA, new Vehicle(1002));
//		vehicleIn(areaA, new Vehicle(1003));
//		vehicleIn(areaA, new Vehicle(1004));
//		vehicleIn(areaA, new Vehicle(1005));
//		vehicleIn(areaA, new Vehicle(1006));
//		vehicleIn(areaA, new Vehicle(1007));
//		vehicleIn(areaA, new Vehicle(1008));
//		vehicleIn(areaA, new Vehicle(1009));
//		vehicleIn(areaA, new Vehicle(1010));
//		vehicleIn(areaA, new Vehicle(1011));
//		Printarea(areaA);
//		vehicleOut(areaA, 1002);
//		vehicleOut(areaA, 1004);
//		vehicleOut(areaA, 1008);
//		Printarea(areaA);
//	}
//}
