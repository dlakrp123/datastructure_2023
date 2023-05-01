import java.lang.reflect.Array;
import java.util.Arrays;

public class ArgsTest {
	public static void main(String[] args) {
		int len = args.length;
		int max = 0;
		int[] intArgs = new int[args.length];
		
		for (int i = 0; i < len; i++)
			System.out.println(args[i]);
		
		for(int i = 0;i<len;i++) {
			intArgs[i] = Integer.parseInt(args[i]);
		}
		
		Arrays.sort(intArgs);//값을 비교하시라길래 오름차순으로 정렬했습니다.
		
		System.out.print("오름차순으로 정렬: ");
		for(int i = 0 ; i<len ;i++) {
			System.out.print(intArgs[i] + " ");
		}
		
	}
}