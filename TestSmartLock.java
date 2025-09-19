import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSmartLock {

    @Test
    void testSetAndGetBatteryConsumption_BrandA(){
        SmartLock lock = new BrandALock();
        lock.setBatteryConsumption(6);
        assertEquals(6, lock.getBatteryConsumption());
    }

    @Test
    void testSetAndGetBatteryConsumption_BrandB(){
        SmartLock lock = new BrandBLock();
        lock.setBatteryConsumption(8);
        assertEquals(8, lock.getBatteryConsumption());
    }
}
