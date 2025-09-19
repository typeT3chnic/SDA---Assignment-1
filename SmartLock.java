/*
 * Jayden Mallari (100927861) & Rabab Raza (100932792)
 * CRN 45740
 * Group 4
 * SmartLock.java is an interface for the BrandALock and BrandBLock classes.
 * It sets the blueprints for how these Smart Locks from their respective brands will behave.
 */

// Abstract product interface for Smart Bulbs
public interface SmartLock {
    void setBatteryConsumption(int value);  // Factory Method
    int getBatteryConsumption();
    void create();
}

//concrete product class for Brand A Smart Locks
class BrandALock implements SmartLock{
    private int batt;

    public BrandALock(){
    }

    //once object is created, battery consumption can be adjusted
    public void setBatteryConsumption(int b){
        this.batt = b;
    }

    //allows user to see how much battery the Smart Lock consumes
    public int getBatteryConsumption(){
        return this.batt;
    }

    //Mostly for behaviour encapsulation.
    public void create(){
        System.out.println("Creating Brand A smart lock.");
    }
}//end BrandALock

//concrete product class for Brand B Smart Locks
class BrandBLock implements SmartLock{
    private int batt;

    public BrandBLock(){
    }

    //once object is created, battery consumption can be adjusted
    public void setBatteryConsumption(int b){
        this.batt = b;
    }

    //allows user to see how much battery the Smart Lock consumes
    public int getBatteryConsumption(){
        return this.batt;
    }

    //Mostly for behaviour encapsulation.
    public void create(){
        System.out.println("Creating Brand B smart lock.");
    }
}//end BrandBLock
