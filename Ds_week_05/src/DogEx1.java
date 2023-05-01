class Dog{
	private String name;
	private int age;
	private static int count = 0;
	public Dog() {count ++;}
	public Dog(String name) {
		this.name = name;
		count ++;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		count ++;
	}
	static void printDog(Dog x) {
		System.out.println("Dog's name : " + x.name + "\tage : "+ x.age);
	}
	static int countDog() {
		return count;
	}
}

public class DogEx1 {
	public static void main(String[] args) {
		Dog d1 = new Dog("Happy", 5);
		Dog d2 = new Dog("Honey", 3);
		Dog d3 = new Dog("Lucky", 2);
		Dog d4 = new Dog("Jeolmi", 4);
		Dog d5 = new Dog("Gom", 1);
		
		d1.printDog(d1);
		d1.printDog(d2);
		d1.printDog(d3);
		d1.printDog(d4);
		d1.printDog(d5);
		
		System.out.println("강아지 만들어진 횟수 : " + d1.countDog());
	}
}
