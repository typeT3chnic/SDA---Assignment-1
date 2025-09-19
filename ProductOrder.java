/*
 * Jayden Mallari (100927861) & Rabab Raza (100932792)
 * CRN 45740
 * Group 4
 * ProductOrder.java is the client class that interacts with the factory classes and calls on their creation functions to instantiate the smart products.
 */

//client class
public class ProductOrder {
    private SmartBulb bulb;
    private SmartLock lock;
    private String pro;

    public ProductOrder(SmartDeviceFactory factory, String product){
        this.pro = product;

        //call createBulb() method if product is bulb
        if(product.equalsIgnoreCase("bulb"))
            this.bulb = factory.createBulb();

        //call createLock() method if product is lock
        else
            this.lock = factory.createLock();
    }

    //call behaviour encapsulation method
    public void createProducts(){
        if(this.pro.equalsIgnoreCase("bulb"))
            this.bulb.create();

        else
            this.lock.create();
    }

    //set Power usage for smart bulb
    public void setPwrUsage(int p){
        this.bulb.setPowerUsage(p);
    }

    //set Battery usage for smart lock
    public void setBatteryCons(int b){
        this.lock.setBatteryConsumption(b);
    }

    //return power usage
    public void getPwrUsage(){
        System.out.println("The power usage of this smart bulb is " + this.bulb.getPowerUsage() + " W.");
    }

    //return battery consumption
    public void getBatteryCons(){
        System.out.println("The battery consumption of this smart lock is " + this.lock.getBatteryConsumption() + " Ah.");
    }
}
