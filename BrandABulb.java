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

    public void create(){
        System.out.println("Creating Brand A smart bulb.");
    }
    
}//end brand A smart bulb
