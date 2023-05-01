
public class Pyungjum {
	public static void main(String[] args) {
		int i = 80; char grade;
		
		if(i>=90) {
			grade = 'A';
		}
		else if(i>=80) {
			grade = 'B';
		}
		else if(i>=70) {
			grade = 'C';
		}
		else if(i>=60) {
			grade = 'D';
		}
		else
			grade = 'E';
		
		System.out.println(grade + " 학점입니다.");
	}
}
