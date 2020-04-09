package arrayKarsilastirma;

public class Baslat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		int[] arr3 = merge(arr1, arr2);
		
		for (int i : arr3) {
			System.out.println(i);
		}
		
	}

	static int[] merge(int[] arr1, int[] arr2) {
		int[] newArray = new int[arr1.length];
		int[] usedNumbers = new int[arr1.length];
		int usedNumberIndex = 0;
		int index = 0;
		boolean devamEtsinMİ = true;
		
		while (devamEtsinMİ) {
			for (int i = 0; i < arr2.length; i++) {
				int counter = 0;
				int temp = 0;
				for (int j = 0; j < arr1.length; j++) {
					temp = arr1[index];
					if (arr2[i] == arr1[j]) {
						counter ++;
					}
				}
				
				boolean isFound = isFoundİnUSedNumbers(arr2, usedNumbers, i);
				if (!isFound) {
					usedNumbers[usedNumberIndex++] = arr2[i];
					for (int q = 0; q < counter; q++) {
						newArray[index++] = arr2[i];
					}
				}
				if (counter == 0) {
					newArray[index++] = temp;
				}
				
			}
			devamEtsinMİ = false;
		}
		return newArray;
	}

	private static boolean isFoundİnUSedNumbers(int[] arr2, int[] usedNumbers, int i) {
		boolean isFound = false;
		for (int q = 0; q < usedNumbers.length; q++) {
			if (usedNumbers[q] == arr2[i]) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}
	
}
