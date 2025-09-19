// BrandBLock.java
class BrandBLock implements SmartLock {
    private int batt;

    public BrandBLock() {
    }

    public void setBatteryConsumption(int b) {
        this.batt = b;
    }

    public int getBatteryConsumption() {
        return this.batt;
    }

    public void create() {
        System.out.println("Creating Brand B smart lock.");
    }
}
