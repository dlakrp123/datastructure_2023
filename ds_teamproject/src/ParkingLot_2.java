import java.util.Stack;

public class ParkingLot_2 {
    static Stack<Integer> parkingSpaceA = new Stack<Integer>();
    static Stack<Integer> parkingSpaceB = new Stack<Integer>(); 

    public void park(int carNumber) {
        if (parkingSpaceA.size() == 10) {
           System.out.println("현재 주차장이 가득 찼습니다. " + carNumber + "를 주차할 수 없습니다.");
            return;
        }else {
        	System.out.println("현재 주차가 가능합니다.");
        	parkingSpaceA.push(carNumber);
        	System.out.println(carNumber + "을 A주차장에 주차하였습니다.");}
    }

    public void unpark(int carNumber) {
        int index = parkingSpaceA.search(carNumber);

        if (index == -1) {
            System.out.println(carNumber + "을 A주차장에서 찾지 못했습니다.");
            return;
        } else {
            for (int i = 0; i < index; i++) {
                parkingSpaceB.push(parkingSpaceA.pop());
            }
            
            while (!parkingSpaceB.isEmpty()) {
                parkingSpaceA.push(parkingSpaceB.pop());
            }

            System.out.println(carNumber + "가 정상적으로 출차되었습니다.");
        	}
        }
        public void printNumOfParkedCars() {
            System.out.println("현재 주차된 차량의 수: " + parkingSpaceA.size());
        }

    public static void main(String[] args) {
        ParkingLot_2 parkingLot = new ParkingLot_2();

        parkingLot.park(7512);
        parkingLot.park(1176);
        parkingLot.park(9923);
        parkingLot.park(3948);
        parkingLot.park(1905);
        parkingLot.park(2219);
        parkingLot.park(6609);
        parkingLot.park(2220); 
        parkingLot.park(2039);
        parkingLot.park(1234); 
        parkingLot.park(4567);

   
        parkingLot.unpark(2220); 
        parkingLot.unpark(1235); 
        parkingLot.unpark(1234); 

    
    }
}