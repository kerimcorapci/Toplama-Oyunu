package metotIleKarsilastirma;

import java.util.Arrays;

public class Baslat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		int[] arr3 = getDifferents(arr1, arr2);
		
		for (int i : arr3) {
			System.out.println(i);
		}
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		return null;
		
	}
public static int[] getDifferents(int[] arr1, int[] arr2) {
	int[] differents = new int[0];
	for (int i = 0; i < arr1.length; i++) {
		boolean IsFound = false;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[i] == arr2[j]) {
				IsFound = true;
				break;
			}
		}
		if (!IsFound) {
			differents = Arrays.copyOf(differents, differents.length+1);
			differents[differents.length-1]=arr1[i];
		}
	}
	return differents;
}
}
