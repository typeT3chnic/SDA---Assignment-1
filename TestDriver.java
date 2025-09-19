/*
* Jayden Mallari (100927861) & Rabab Raza (100932792)
* CRN 45740
* Group 4
* TestDriver class that runs code
*/
public class TestDriver {
    public static void main(String[] args) {

        //Brand A Smart Bulb example
        SmartDeviceFactory factory = new BrandAFactory();
        ProductOrder fstOrder = new ProductOrder(factory, "bulb");
        fstOrder.createProducts();
        fstOrder.setPwrUsage(5);
        fstOrder.getPwrUsage();

        System.out.println();

        //Brand B Smart Lock example
        SmartDeviceFactory manufacture = new BrandBFactory();
        ProductOrder secOrder = new ProductOrder(manufacture, "lock");
        secOrder.createProducts();
        secOrder.setBatteryCons(3);
        secOrder.getBatteryCons();

    }
}
