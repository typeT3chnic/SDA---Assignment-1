// BrandBBulb.java
class BrandBBulb implements SmartBulb {
    private int pwrUsage;

    public BrandBBulb() {
    }
  
    public void setPowerUsage(int p) {
        this.pwrUsage = p;
    }

    public int getPowerUsage() {
        return this.pwrUsage;
    }

    public void create() {
        System.out.println("Creating Brand B smart bulb.");
    }
}
