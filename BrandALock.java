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

    public void create(){
        System.out.println("Creating Brand A smart lock.");
    }
}//end Brand A Lock
