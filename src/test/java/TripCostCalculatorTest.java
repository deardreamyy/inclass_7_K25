import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @Test
    void calculateCost() {
        double distance = 100;
        double fuelConsumption = 5.0;
        double fuelCost = 1.0;
        double expected = 5.0;
        double actual = TripCostCalculator.calculateCost(distance, fuelConsumption, fuelCost);
        assertEquals(expected, actual, 0.0001);
    }
}