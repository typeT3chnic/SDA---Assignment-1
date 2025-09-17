// SmartBulb.java
public interface SmartBulb {
    void setPowerUsage(int value);  // Factory Method
    int getPowerUsage();
    void create();
}



// SmartLock.java
public interface SmartLock {
    void setBatteryConsumption(int value);  // Factory Method
    int getBatteryConsumption();
    void create();
}


