import java.util.Scanner;

public class TripCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance;
        double fuelCost;
        double fuelCostPerLiter;
        double fuelConsumption = 5.0;

        System.out.println("Enter the distance of the trip in kilometers: ");
        distance = scanner.nextDouble();

        System.out.println("Enter the cost of fuel per liter: ");
        fuelCostPerLiter = scanner.nextDouble();

        fuelCost = calculateCost(distance, fuelConsumption, fuelCostPerLiter);

        System.out.println("The cost of the trip is: " + fuelCost);
    }

    public static double calculateCost(double distance, double fuelConsumption, double fuelCost) {
        double fuelAmount = (distance / 100) * fuelConsumption;
        return fuelAmount * fuelCost;
    }
}
