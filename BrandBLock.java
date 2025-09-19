// BrandBLock.java
class BrandBLock implements SmartLock {
    private int batt;

    public BrandBLock() {
    }

    @Override
    public void setBatteryConsumption(int b) {
        this.batt = b;
    }

    @Override
    public int getBatteryConsumption() {
        return this.batt;
    }

    @Override
    public void create() {
        System.out.println("Creating Brand B smart lock.");
    }
}
