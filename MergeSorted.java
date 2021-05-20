import java.util.Arrays;

public class MergeSorted {

	public static void main(String[] args) {
		int[] a2 = { 1, 4, 5, 8, 17 };
		int[] a1 = { 2, 4, 8, 11, 13, 21, 23, 25 };
		System.out.println(Arrays.toString(merge(a1, a2)));

	}

	public static int[] merge(int[] arr1, int[] arr2) {

		int[] b = new int[arr1.length + arr2.length];
		int i = 0, j = 0, u = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				b[u] = arr2[j];
				u++;
				j++;
			} else {
				b[u] = arr1[i];
				u++;
				i++;
			}
		}

		if (arr1.length - i <= 0) {
			for (int x = j; x < arr2.length; x++) {
				b[u] = arr2[x];
				u++;
			}
		} else {
			for (int x = i; x < arr1.length; x++) {
				b[u] = arr1[x];
				u++;
			}
		}

		return b;
	}

}
