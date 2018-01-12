package basics_review;

public class Fabonaccii2 {
    public static void main(String[] args) {
        //Basic Ideology about Fabonnaci  is the sum of the current number plus the previous number
        //fab(a) = fab(a)
        //fab(b) = fab(a) + fab(b)
        //fab(c) = fab(b) + fab(c)
        System.out.println(fabonnaci(6 ));

    }
    public static int fabonnaci(int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }return fabonnaci(n-1) + fabonnaci(n-2);
    }

}
