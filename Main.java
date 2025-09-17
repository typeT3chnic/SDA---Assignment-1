// SmartBulb.java
public interface SmartBulb {
    void setPowerUsage(int value);  // Factory Method
    int getPowerUsage();
}

//BrandABulb
class BrandABulb implements SmartBulb{
    private int pwrUsage;
    public BrandABulb() {
    }
    
    public void setPowerUsage(int p){
        this.pwrUsage = p;
    }
    
    public int getPowerUsage(){
        return this.pwrUsage;
    }
    
}//end brand A smart bulb


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
