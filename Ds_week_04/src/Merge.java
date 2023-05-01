import java.util.Arrays;

public class Merge {

    public static void MergeS(int[] arr1, int[] arr2) {

        int[] sorted_arr = new int[arr1.length + arr2.length];

        int cur1 = 0;
        int cur2 = 0;
        int cur3 = 0;

        while (cur3 < sorted_arr.length - 1) {

            if (cur1 > arr1.length - 1 - 1 && cur2 > arr2.length - 1) {
                sorted_arr[cur3++] = 0;
            } else if (cur1 > arr1.length - 1) {
                sorted_arr[cur3++] = arr2[cur2++];

            } else if (cur2 > arr2.length - 1) {
                sorted_arr[cur3++] = arr1[cur1++];
            } else if (arr1[cur1] == arr2[cur2]) {
                sorted_arr[cur3++] = arr1[cur1++];
                cur2++;
            } else {
                sorted_arr[cur3++] = arr1[cur1] < arr2[cur2] ? arr1[cur1++] : arr2[cur2++];
            }

        }

        System.out.println(Arrays.toString(sorted_arr));

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 6, 7, 8, 9, 14, 16 }; // run1. 정렬되어 있음.
        int[] arr2 = { 4, 5, 7, 10, 13, 16 }; // run2. 정렬되어 있음.

        MergeS(arr1, arr2);
    }
}