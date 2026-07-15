import java.util.Arrays;

public class Task1_2_5 {
    public static void main(String[] args) {
        System.out.println(drawsMonitorsCounter(8, 3));
        System.out.println(priceCalculation(10.44, 4));
        calcCircleRadius(67.5);
    }

    public static int drawsMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }

    public static double priceCalculation(double price, int count) {
        return price * count;
    }

    public static void calcCircleRadius(double area) {
        System.out.printf("%.3f%n", Math.sqrt(area / Math.PI));
        ;
    }


}