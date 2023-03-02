package Lesson6;

public class Vehicle {
    int passengers;
    int fuelCap;
    int milesPerGallon;

    void RangeCalculation() {
        System.out.println("Distance is " + fuelCap * milesPerGallon);
    }
    int rangeCalc() { return  fuelCap * milesPerGallon; }

    void RangeCalculationWithName(String name) {
        System.out.println(name + " can take " + passengers + " passengers at a distance of "
        + fuelCap * milesPerGallon + ".");
    }
    int pricePerPassenger(int price) {
       return rangeCalc()*price/passengers;
    }

}
