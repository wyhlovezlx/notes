public class BubbleSort {

	public static void main(String[] args) {
		int[] test = {2,1,3,8,9,9};
		bubbleSort(test);
		for (int i : test) {
			System.out.println(i);
		}   
	}
	
	/**
	 * Bubble Sort 
	 * @param int[]
	 * @return
	 */
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;	
				}
			}
		}
	}

}
