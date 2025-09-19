/*
 * Jayden Mallari (100927861) & Rabab Raza (100932792)
 * CRN 45740
 * Group 4
 * SmartDeviceFactory.java is an interface that is implemented by both BrandAFactory and BrandBFactory classes.
 * These classes return instances of the desired product from their respective brands.
 */

public interface SmartDeviceFactory {
    SmartBulb createBulb();
    SmartLock createLock();
}

class BrandAFactory implements SmartDeviceFactory{
    public SmartBulb createBulb(){
        return new BrandABulb();
    }

    public SmartLock createLock(){
        return new BrandALock();
    }
}//end BrandAFactory


class BrandBFactory implements SmartDeviceFactory{
    public SmartBulb createBulb(){
        return new BrandBBulb();
    }

    public SmartLock createLock(){
        return new BrandBLock();
    }
}//end BrandBFactory




