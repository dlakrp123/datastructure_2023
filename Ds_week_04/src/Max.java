import java.util.Random;

public class Max {
	static void maximum(int fdata[]) {
		int fmax, second = 0;
		fmax = fdata[0];
		
		for(int i = 0 ; i <fdata.length ; i++) {
			if(fdata[i] > fmax) {
				second = fmax;
				fmax = fdata[i];
			}
			else if(fdata[i] > second && fdata[i] != fmax)
				second = fdata[i];
		}
		System.out.println(fmax);
		System.out.println(second);
	}
	public static void main(String[] args) {
		Random rd = new Random();
		int data[] = new int [100];
		int max;
		
		for(int i = 0 ; i < 100 ; i++)
			data[i] = rd.nextInt(999);
		
		maximum(data);
	}
}
