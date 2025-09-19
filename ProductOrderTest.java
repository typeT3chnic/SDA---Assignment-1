import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOrderTest {
   
    @Test
    void testCreateBulbOrder(){
        SmartDeviceFactory factory = new BrandAFactory();
        ProductOrder order = new ProductOrder(factory, "bulb");

        order.setPwrUsage(15);
        assertEquals(15, (factory.createBulb()).getPowerUsage());//only tests state of output, not the actual output itself

    }

    @Test
    void testCreateLockOrder(){
        SmartDeviceFactory factory = new BrandBFactory();
        ProductOrder order = new ProductOrder(factory, "lock");

        order.setBatteryCons(4);
        assertEquals(4, (factory.createLock()).getBatteryConsumption());
    }
}
