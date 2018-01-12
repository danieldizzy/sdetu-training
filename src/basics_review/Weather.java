package basics_review;

public class Weather {
    public static void main(String[] args) {
        String weatherContrast = "Sunny";
        int temparature = 50;
        String measurement = "Celcius";

        if (temparature == 90){
            System.out.println("The weather is very hot wear something light");
        }else if (temparature < 50){
            System.out.println("A little bit chilly today, wear something warm");
        }else if ((temparature == 50) && (weatherContrast == "Sunny")){
            System.out.println("Man its freezing wear some warm clothing");
        }
    }
}
