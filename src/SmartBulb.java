/*
 * Jayden Mallari (100927861) & Rabab Raza (100932792)
 * CRN 45740
 * Group 4
 * SmartBulb.java is an interface for the BrandABulb and BrandBBulb classes.
 * It sets the blueprints for how these Smart Bulbs from their respective brands will behave.
 */

// Abstract product interface for Smart Bulbs
public interface SmartBulb {
    void setPowerUsage(int value);
    int getPowerUsage();
    void create();
}

//concrete product class for Brand A Smart Bulbs
class BrandABulb implements SmartBulb{
    private int pwrUsage;

    public BrandABulb() {
    }

    //once object is created, power usage can be adjusted
    public void setPowerUsage(int p){
        System.out.println("Setting power usage to " + p + " W...");
        this.pwrUsage = p;
    }

    //allows user to see how much power the Smart Bulb uses
    public int getPowerUsage(){
        return this.pwrUsage;
    }

    //Mostly for behaviour encapsulation.
    public void create(){
        System.out.println("Creating Brand A smart bulb.");
    }

}//end BrandABulb

//concrete product class for Brand B Smart Bulbs
class BrandBBulb implements SmartBulb{
    private int pwrUsage;

    public BrandBBulb() {
    }

    //once object is created, power usage can be adjusted
    public void setPowerUsage(int p){
        System.out.println("Setting power usage to " + p + " W...");
        this.pwrUsage = p;
    }

    //allows user to see how much power the Smart Bulb uses
    public int getPowerUsage(){
        return this.pwrUsage;
    }

    //Mostly for behaviour encapsulation.
    public void create(){
        System.out.println("Creating Brand B smart bulb...");
    }

}//end BrandBBulb


