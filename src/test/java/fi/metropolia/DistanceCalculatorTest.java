package fi.metropolia;

import org.junit.Test;
import static org.junit.Assert.*;

public class DistanceCalculatorTest {

    @Test
    public void testCalculateDistance() {
        // Create an instance of the DistanceCalculator
        DistanceCalculator calculator = new DistanceCalculator();

        // Define the coordinates of two points
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 4.0;
        double y2 = 6.0;

        // Calculate the expected distance manually
        double expectedDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Calculate the distance using the DistanceCalculator class
        double actualDistance = calculator.calculateDistance(x1, y1, x2, y2);

        // Check if the actual distance matches the expected distance with a delta for floating-point precision
        double delta = 0.0001; // Adjust the delta as needed for your precision requirements
        assertEquals(expectedDistance, actualDistance, delta);
    }
}
