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
