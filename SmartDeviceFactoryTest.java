/*
 * Jayden Mallari (100927861) & Rabab Raza (100932792)
 * CRN 45740
 * Group 4
 * SmartDeviceFactoryTest.java tests to see if classes implementing SmartDeviceFactory.java are returning the proper instances when their creation methods are called
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartDeviceFactoryTest {
    @Test//tests if BrandAFactory returns a BrandABulb when its createBulb() function is called
    void testBrandAFactoryCreatesBulb(){
        SmartDeviceFactory factory = new BrandAFactory();
        SmartBulb bulb = factory.createBulb();
        assertNotNull(bulb);
        assertInstanceOf(BrandABulb.class, bulb);
    }

    @Test//tests if BrandAFactory returns a BrandALock when its createLock() function is called
    void testBrandAFactoryCreatesLock(){
        SmartDeviceFactory factory = new BrandAFactory();
        SmartLock lock = factory.createLock();
        assertNotNull(lock);
        assertInstanceOf(BrandALock.class, lock);
    }

    @Test//tests if BrandBFactory returns a BrandBBulb when its createBulb() function is called
    void testBrandBFactoryCreatesBulb(){
        SmartDeviceFactory factory = new BrandBFactory();
        SmartBulb bulb = factory.createBulb();
        assertNotNull(bulb);
        assertInstanceOf(SmartBulb.class, bulb);
    }

    @Test//tests if BrandBFactory returns a BrandBBulb when its createLock() function is called
    void testBrandBFactoryCreatesLock(){
        SmartDeviceFactory factory = new BrandBFactory();
        SmartLock lock = factory.createLock();
        assertNotNull(lock);
        assertInstanceOf(BrandBLock.class, lock);
    }
}
