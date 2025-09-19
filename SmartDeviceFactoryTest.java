import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartDeviceFactoryTest {
    @Test
    void testBrandAFactoryCreatesBulb(){
        SmartDeviceFactory factory = new BrandAFactory();
        SmartBulb bulb = factory.createBulb();
        assertNotNull(bulb);
        assertInstanceOf(BrandABulb.class, bulb);
    }

    @Test
    void testBrandAFactoryCreatesLock(){
        SmartDeviceFactory factory = new BrandAFactory();
        SmartLock lock = factory.createLock();
        assertNotNull(lock);
        assertInstanceOf(BrandALock.class, lock);
    }

    @Test
    void testBrandBFactoryCreatesBulb(){
        SmartDeviceFactory factory = new BrandBFactory();
        SmartBulb bulb = factory.createBulb();
        assertNotNull(bulb);
        assertInstanceOf(SmartBulb.class, bulb);
    }

    @Test
    void testBrandBFactoryCreatesLock(){
        SmartDeviceFactory factory = new BrandBFactory();
        SmartLock lock = factory.createLock();
        assertNotNull(lock);
        assertInstanceOf(BrandBLock.class, lock);
    }
}
