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
