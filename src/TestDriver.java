/*
* Jayden Mallari (100927861) & Rabab Raza (100932792)
* CRN 45740
* Group 4
* TestDriver class that runs code
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {

        String brand, product;
        int val;

        try {//try catch to catch exceptions thrown when reading the file
            File file = new File("sampleOrder.txt");// create file object for Scanner to read through
            //NOTE: make sure txt file is found in root directory! It cannot be read otherwise!

            Scanner scan = new Scanner(file);//Scanner to read the external text file

            while (scan.hasNext()) {//reads until all contents have been read
                brand = scan.next();//Reads the brand (either Brand A or B)
                product = scan.next();//Smart Bulb or Lock
                val = scan.nextInt();//Power usage/Battery Consumption value

                SmartDeviceFactory factory; //Declare factory object

                if (brand.equalsIgnoreCase("A")) {
                    factory = new BrandAFactory();//creates BrandAFactory instance if brand = A
                }
                else {
                    factory = new BrandBFactory();//creates BrandBFactory instance if brand = B
                }

                //passes the factory and product as arguments to Client code
                ProductOrder order = new ProductOrder(factory, product);
                //once smart products have been created and stored within Client class, function that calls the products' behaviour encapsulation functions will be called
                order.createProducts();

                if (product.equalsIgnoreCase("bulb")) {
                    order.setPwrUsage(val);//function within client code that calls the Smart Bulb's own setter method
                    order.getPwrUsage();//function within client code that calls the Smart Bulb's own getter method
                }
                else {
                    order.setBatteryCons(val);//function within client code that calls the Smart Lock's own setter method
                    order.getBatteryCons();//function within client code that calls the Smart Lock's own getter method
                }

                System.out.println();//separator of orders
            }

            scan.close();//close scanner

            } catch (FileNotFoundException e) {//error message in case file cannot be read
                System.out.println("Error: sampleOrder.txt not found!");
        }
    }
}
