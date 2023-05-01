
public class StudentScore {
	public static void main(String[] args) {
		String name[] = {"가","나","다","라","마","바","사","아","자","차"};
		
		float[][] score = {{100,100,100,0}, {90,90,90,0}, {50,50,50,0}, {60,50,60,0}, {70,70,70,0},
				{80,78,81,0},{50,60,55,0},{80,80,30,0},{55,89,40,0},{60,60,61,0},{0,0,0,0}};
		
		
		for(int i = 0 ; i < score.length-1 ; i++) {
			for(int j = 0;j<score[0].length-1 ; j++) {
				score[i][score[0].length-1] += score[i][j];
			}
			score[i][score[0].length-1] /= (score[0].length-1);//학생들의 평균점수 구하는 메소드
		}
		
		for(int i = 0 ; i < score.length-1 ; i++) {
			for(int j = 0;j<score[0].length-1 ; j++) {
				score[score.length-1][j] += score[i][j];//매 시험의 점수를 더하는 메소드
			}
		}
		
		for(int i = 0 ; i < score.length-1 ; i++) {
			System.out.print(name[i] + " : ");
			for(int j = 0;j<score[0].length ; j++) {
				System.out.print(score[i][j] + "\t");//학생들의 점수 출력.
			}
			System.out.println();
		}
		System.out.println("-----------매 시험의 평균 점수-----------");
		for(int i = 0 ; i < score[0].length-1 ; i++) {
			System.out.print(score[score.length-1][i]/(score.length-1) + "\t");//매 시험의 평균점수 출력.
		}
		System.out.println();
		System.out.println("-----------낙제한 학생의 이름과 점수-------------");
		for(int i = 0 ;i< score.length-1 ; i++) {
			if(score[i][score[0].length-1]<60) {
				System.out.print(name[i] + " : " + score[i][score[0].length-1]);//낙제한 학생의 이름과 점수 출력.
				System.out.println();
			}
		}
	}
}
