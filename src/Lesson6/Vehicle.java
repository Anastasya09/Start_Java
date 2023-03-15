package Lesson6;

public class Vehicle {
    int passengers;
    int fuelCap;
    int milesPerGallon;

    public Vehicle(int passengers, int fuelCap, int milesPerGallon) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.milesPerGallon = milesPerGallon;
    }

    public void RangeCalculation() {
        System.out.println("Distance is " + fuelCap * milesPerGallon);
    }
    public int rangeCalc() { return  fuelCap * milesPerGallon; }

    public void RangeCalculationWithName(String name) {
        System.out.println(name + " can take " + passengers + " passengers at a distance of "
        + fuelCap * milesPerGallon + ".");
    }
    public int pricePerPassenger(int price) {
       return rangeCalc()*price/passengers;
    }

}
