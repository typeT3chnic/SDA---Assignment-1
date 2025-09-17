//SmartDeviceFactory Abstract Factory Interface
public interface SmartDeviceFactory {
    SmartBulb createBulb();
    SmartLock createLock();
}

//BrandAFactory
class BrandAFactory implements SmartDeviceFactory{
    public SmartBulb createBulb(){
        return new BrandABulb();
    }
    
    public SmartLock createLock(){
        return new BrandALock();
    }
}//end BrandAFactory
