package algorithms;

public class BinarySearch {

    public static int binarySearch(int[] dataSet, int target, int start, int end) {

        System.out.println("Searching between " + dataSet[start] + " and " + dataSet[end]);
        int midpoint = (int) Math.floor(((start + end) / 2));
        int value = dataSet[midpoint];


        if (target > value) {

            System.out.println(target + " > " + value);
            return binarySearch(dataSet, target, midpoint + 1, end);
        } else if (target < value) {
            System.out.println(target + " < " +  value);
            return binarySearch(dataSet, target, start, midpoint - 1);
        }
        System.out.println(target + " = " + value);
        return midpoint;
    }
}
