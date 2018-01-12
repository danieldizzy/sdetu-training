package basics_review;

public class Assignment {

    //Write a funtion that takes a value N and returns the sum of 1 to n
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6,-2, 7, 9};
        System.out.println(findMin(numbers));
        System.out.println(arryNum(numbers));
        System.out.println(findAvg(numbers));
        System.out.println(findMax(numbers));
    }

    public static int arryNum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; //we assume that the maximum is at zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0]; //we assume that the minimum is at zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
}