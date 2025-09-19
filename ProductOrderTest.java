/*
 * Jayden Mallari (100927861) & Rabab Raza (100932792)
 * CRN 45740
 * Group 4
 * ProductOrderTest.java tests to see if the client code and its functions are interacting correctly with the other classes.
 * i.e. returning the proper print outputs when create() or getter functions are called.
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// Test classes to run ProductOrderTest
class TestBulb implements SmartBulb {
    private int power;

    public void create() {
        System.out.print("");
    }

    public void setPowerUsage(int p) {
        this.power = p;
    }

    public int getPowerUsage() {
        return this.power;
    }
}//end TestBulb

class TestLock implements SmartLock {
    private int battery;

    public void create() {
        System.out.print("");
    }

    public void setBatteryConsumption(int b) {
        this.battery = b;
    }

    public int getBatteryConsumption() {
        return this.battery;
    }
}//end TestLock

class TestFactory implements SmartDeviceFactory {

    public SmartBulb createBulb() {
        return new TestBulb();
    }

    public SmartLock createLock() {
        return new TestLock();
    }
}//end TestFactory

//ProductOrderTest to test print statements
public class ProductOrderTest {

    private final PrintStream originalOut = System.out; // stores the original output to console
    private ByteArrayOutputStream outContent; //redirects output from System.out to itsel

    @BeforeEach//preparing testing environment
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();//prepares object that stores what would be printed to the console
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach//restoring testing environment for future tests
    public void restoreStreams() {//ensures originalOut is restored back to normal for future tests
        System.setOut(originalOut);
    }

    @Test //Tests the power usage print statement from SmartBulb objects from getPwrUsage()
    public void testBulbPrintStatements() {
        ProductOrder order = new ProductOrder(new TestFactory(), "bulb");
        order.createProducts();
        order.setPwrUsage(10);
        order.getPwrUsage();

        String expected = "The power usage of this smart bulb is 10 W." + System.lineSeparator();
        assertEquals(expected, outContent.toString()); //ensures output matches expected output
    }

    @Test //Tests the battery consumption print statement from SmartBulb objects from getBatteryCons()
    public void testLockPrintStatements() {
        ProductOrder order = new ProductOrder(new TestFactory(), "lock");
        order.createProducts();
        order.setBatteryCons(5);
        order.getBatteryCons();

        String expected = "The battery consumption of this smart lock is 5 Ah." + System.lineSeparator();
        assertEquals(expected, outContent.toString()); //ensures output matches expected output
    }
}

