package algorithms;

public class BubbleSort {

    public static void bubbleSort(int[] dataSet) {
        boolean swapped = false;
        System.out.print("\nOriginal Array \n");
        printArray(dataSet);
        do {
            for (int i = 0; i < dataSet.length - 1; i++) {
                if (dataSet[i] > dataSet[i + 1]) {
                    int tmpData = dataSet[i];
                    dataSet[i] = dataSet[i + 1];
                    dataSet[i + 1] = tmpData;
                    printArray(dataSet);
                    swapped = true;
                }
            }
        } while (swapped);

    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


