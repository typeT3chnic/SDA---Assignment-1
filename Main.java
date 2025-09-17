// SmartBulb.java
public interface SmartBulb {
    void setPowerUsage(int value);  // Factory Method
    int getPowerUsage();
}



// SmartLock.java
public interface SmartLock {
    void setBatteryConsumption(int value);  // Factory Method
    int getBatteryConsumption();
}


// BrandALock 
class BrandALock implements SmartLock{
    private int batt;
    public BrandALock(){

    }

    public void setBatteryConsumption(int b){
        this.batt = b;
    }

    public int getBatteryConsumption(){
        return this.batt;
    }
}//end Brand A Lock
