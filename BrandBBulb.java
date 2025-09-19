// BrandBBulb.java
class BrandBBulb implements SmartBulb {
    private int pwrUsage;

    public BrandBBulb() {
    }

    @Override
    public void setPowerUsage(int p) {
        this.pwrUsage = p;
    }

    @Override
    public int getPowerUsage() {
        return this.pwrUsage;
    }

    @Override
    public void create() {
        System.out.println("Creating Brand B smart bulb.");
    }
}
