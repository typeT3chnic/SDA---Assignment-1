import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSmartBulb {
    @Test
    void testSetAndGetPowerUsage_BrandA() {
        SmartBulb bulb = new BrandABulb();
        bulb.setPowerUsage(7);
        assertEquals(7, bulb.getPowerUsage());
    }

    @Test
    void testSetAndGetPowerUsage_BrandB() {
        SmartBulb bulb = new BrandBBulb();
        bulb.setPowerUsage(15);
        assertEquals(15, bulb.getPowerUsage());
    }
}
