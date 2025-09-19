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
