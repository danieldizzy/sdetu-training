package basics;

public class Weather {
    public static void main(String[] args) {
        int temperature = 100;
        String overCast = "Sunny";

        if (temperature == 90){
            System.out.println("The temperature is: " + temperature + "degres");
            System.out.println("Its very Hot wear something light");
        }else if (temperature < 50){
            System.out.println("Its chilly today wear something warm");
        }else if ((temperature == 100)&& ( overCast == "Sunny")){
            System.out.println("It is really hot today wear a tshirt");
        }
    }
}
