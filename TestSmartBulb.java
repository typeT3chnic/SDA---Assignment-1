/*
 * Jayden Mallari (100927861) & Rabab Raza (100932792)
 * CRN 45740
 * Group 4
 * TestSmartBulb.java tests the behaviour encapsulation methods of all instances of classes implementing the SmartBulb interface
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSmartBulb {
    @Test//tests setting the power usage and retrieving the correct value for Brand A Smart Bulbs
    void testSetAndGetPowerUsage_BrandA() {
        SmartBulb bulb = new BrandABulb();
        bulb.setPowerUsage(7);
        assertEquals(7, bulb.getPowerUsage());
    }

    @Test//tests setting the power usage and retrieving the correct value for Brand B Smart Bulbs
    void testSetAndGetPowerUsage_BrandB() {
        SmartBulb bulb = new BrandBBulb();
        bulb.setPowerUsage(15);
        assertEquals(15, bulb.getPowerUsage());
    }
}
