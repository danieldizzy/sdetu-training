package algorithms;

public class Demo {
    public static void main(String[] args) {
        //the given array
        int[] linearNumbers = {101, 55, 54, 621, 643, 893,  6, 3, 643, 84, 493};
        int[] binarySearchnumbers = {1, 3, 5, 6, 8, 9, 10, 15, 17, 19, 27, 29, 34, 38, 49, 50, 55, 69, 78, 89};


        //call the algorithm to parse the given array
        int pos = LineaSearch.linearSearch(linearNumbers, 3);
        System.out.println("The value was wound at " + pos);


        int index = BinarySearch.binarySearch(binarySearchnumbers, 34, 0, binarySearchnumbers.length - 1);
        System.out.println(" the middle is " + index);

        BubbleSort.bubbleSort(linearNumbers);




    }
}
