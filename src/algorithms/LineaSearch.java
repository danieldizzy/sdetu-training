package algorithms;

public class LineaSearch {

    public static int linearSearch (int[] dataSet, int target) {
        for (int i = 0; i<dataSet.length; i++) {
            if (dataSet[i] == target) {
                return i;
            }
        }
        return 0;
    }
}
