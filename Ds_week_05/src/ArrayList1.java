
public class ArrayList1 {
	public static void main(String[] args) {
		//1
		String[] list1 = {"Choi", "Kim", "Lee", "Park", "Yoo"};
		//2
		for(String i : list1) {
			System.out.print(i + " ");
		}
		System.out.println();
		//3
		System.out.println(list1[0]);
		//4
		System.out.println(list1[list1.length-1]);
		//5
		System.out.println(list1[(list1.length-1)/2]);
		//6
		System.out.println(list1.length);
		//7
		String[] list2 = {"Moon", "Song", "Seo", "Jeong"};
		//8
		String[] list3 = new String[list1.length + list2.length];
		
		for(int i = 0 ; i < list1.length ; i++) {
			list3[i] = list1[i];
		}
		for(int i = 0 ; i< list2.length ; i++) {
			list3 [i + list1.length] = list2[i];
		}
		
		for(String s : list3) {
			System.out.print(s + " ");
		}
	}
}
