/*
 * Jayden Mallari (100927861) & Rabab Raza (100932792)
 * CRN 45740
 * Group 4
 * TestSmartLock.java tests the behaviour encapsulation methods of all instances of classes implementing the SmartLock interface
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSmartLock {

    @Test//tests setting the battery consumption and retrieving the correct value for Brand A Smart Locks
    void testSetAndGetBatteryConsumption_BrandA(){
        SmartLock lock = new BrandALock();
        lock.setBatteryConsumption(6);
        assertEquals(6, lock.getBatteryConsumption());
    }

    @Test//tests setting the battery consumption and retrieving the correct value for Brand B Smart Locks
    void testSetAndGetBatteryConsumption_BrandB(){
        SmartLock lock = new BrandBLock();
        lock.setBatteryConsumption(8);
        assertEquals(8, lock.getBatteryConsumption());
    }
}
