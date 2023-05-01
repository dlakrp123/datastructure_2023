

public class Avarage {
	public static void main(String[] args){
		
		int[] score = {1,2,3,4,5,6,7,8,9,10};
		
		float sum = 0;  
		for(int i=0; i<10; i++ ){ 
			sum += score[i];
		}
			float avg = sum/10;
			System.out.println(avg);
		}
}

