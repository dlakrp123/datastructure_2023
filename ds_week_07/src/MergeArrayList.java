
public class MergeArrayList {
	public static void main(String[] args) {
		int[] list1 = { 10, 40, 100, 122 };
		int[] list2 = { 15, 30, 80, 150, 200, 300, 400 };
		int[] list3 = new int[list1.length + list2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while ((i < list1.length) && (j < list2.length)) {
			if (list1[i] < list2[j]) {
				list3[k] = list1[i];
				k++;
				i++;
			} else {
				list3[k] = list2[j];
				k++;
				j++;
			}
		}
		if (i == list1.length) {
			for (int x = j; x < list2.length; x++) {
				list3[k] = list2[x];
				k++;
			}
		} else {
			for (int x = i; x < list1.length; x++) {
				list3[k] = list1[x];
				k++;
			}
		}
		for(int x = 0 ; x<list3.length ; x++) {
			System.out.print(list3[x] + " ");
		}
	}
}
