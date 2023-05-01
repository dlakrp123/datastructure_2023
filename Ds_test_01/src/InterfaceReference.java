
interface Animal2{
	public static final String name = "동물";
	public abstract void eat();
	public abstract void bark();
}

class Dog2 implements Animal2{
	public void eat() {
		System.out.println("강아지 사료를 먹는다");
	}
	public void bark() {
		System.out.println("멍멍 짖는다");
	}
}

class Cat implements Animal2{
	public void eat() {
		System.out.println("고양이 사료를 먹는다");
	}
	public void bark() {
		System.out.println("야옹~");
	}
}

public class InterfaceReference {
	public static void main(String[] args) {

		System.out.println("Dog 상속 출력 결과: ");
		Dog2 dog1 = new Dog2();
		dog1.bark();
		dog1.eat();
		
		System.out.println("Cat 상속 출력 결과: ");
		Cat cat1 = new Cat();
		cat1.bark();
		cat1.eat();
		}
}

