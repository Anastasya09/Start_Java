package Lesson6;

public class App {
    public static void main(String[] args) {

        int PRICE = 28;

        int minivanRange;

        Vehicle minivan = new Vehicle(7, 16, 21);

        minivan.RangeCalculation();
        minivanRange = minivan.rangeCalc();
        minivan.rangeCalc();

        System.out.println(minivanRange);

        String vehicleName = "minivan";
        minivan.RangeCalculationWithName(vehicleName);
        int price = 28;
        int result = minivan.pricePerPassenger(price);
        System.out.println(result);

    }
}
