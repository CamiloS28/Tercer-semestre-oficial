package burbuja;

public class burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo = {25,17,1,8,33,10};

        System.out.println("Array before sorting:");
        printArray(arreglo);

        bubbleSort(arreglo);

        System.out.println("Array after sorting:");
        printArray(arreglo);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


