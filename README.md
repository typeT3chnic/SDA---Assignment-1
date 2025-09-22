# Software Design and Architecture---Assignment-1

Jayden Mallari (100927861)

Rabab Raza (100932792)

CRN: 45740

Group 4


INTRODUCTION

This assignment demonstrates the use of design patterns, specifically the abstract factory pattern and the factory method pattern, to create smart home devices for specific brands (i.e. Brand A, Brand B). Each brand distribute a family of products including Smart Bulbs and Smart Locks.



CODE STRUCTURE

The code is contained within the following files:

ProductOrder.java
- Contains the client code. Values read by the driver are passed into this class, which in itself, calls the factory classes and behaviour encapsulation functions of the objects it creates.

SmartDeviceFactory.java
- Contains SmartDeviceFactory interface (abstract factory class interface) along with concrete factory classes implementing it: BrandAFactory and BrandBFactory.
- Class functions are called by client class (ProductOrder.java) that return instances of brand-specific smart bulbs or locks.

SmartLock.java
- Contains abstract product class interface (SmartLock) for Smart Locks and concrete product classes implementing it (BrandALock and BrandBLock).
- Instances of these classes are returned by the factory classes within SmartDeviceFactory.java.
- Behaviour encapsulation functions such as create(), setBatteryConsumption(), and getBatteryConsumption() are called from client class (ProductOrder).

SmartBulb.java
- Contains abstract product class interface (SmartBulb) for Smart Bulbs and concrete product classes implementing it (BrandABulb and BrandBLock).
- Instances of these classes are returned by the factory classes within SmartDeviceFactory.java.
- Behaviour encapsulation functions such as create(), setPowerUsage(), and getPowerUsage() are called from client class (ProductOrder).

TestDriver.java
- Contains driver code that reads values from external txt file and passes them through the client class (ProductOrder).
- Contains main method that runs the code and ensures that all classes and interfaces interact and function as intended.

sampleOrder.txt
- Should be located in Root of directory.
- Contains data for a Brand A Smart Bulb and Brand B Smart Lock
- Contains sample input to test code functionality.

<img width="2035" height="1469" alt="image" src="https://github.com/user-attachments/assets/f3d71725-a9bd-408f-a726-f3e856fc6b73" />





TEST METHODS

To ensure all classes and interfaces function as intended, you will find a TestDriver class to run the code. As per assignment instructions, test methods and instantiations were made to demonstrate the creation of a Smart Bulb from Brand A and a Smart Lock from Brand B.

The test driver reads the external text file and passes values through ProductOrder (client class) until all data has been read.

For the first example, factory, a BrandAFactory object implementing the SmartDeviceFactory interface is created, which only creates Brand A devices (smart bulbs and locks). Next, a ProductOrder (client class) object, "order," is created with the BrandAFactory 'factory' and "bulb" as arguments. Inside ProductOrder's constructer, due to the BrandAFactory and parameter, "bulb", it calls factory.createBulb() which in this case, executes BrandAFactory.createBulb().
Now, fstOrder has a SmartBulb stored within this.bulb as a BrandABulb object.

After the BrandABulb object is created, and stored in ProductOrder, the driver calls methods within the ProductOrder that call that object's specific behaviour encapsulation functions. createProducts() calls BrandABulb's create() function to tell the user the object was successfully instantiated. setPwrUsage() passes the integer value read from the text file to the setPowerUsage() in BrandABulb which sets the power usage of the smart bulb. getPwrUsage() calls getPowerUsage() from BrandABulb which returns the power usage of the smart bulb.

For the second example, a new factory becomes a BrandBFactory object implementing the SmartDeviceFactory interface, which only creates Brand B devices (smart bulbs and locks). The process is very similar to the first example. The only difference is the functions called by ProductOrder. After the Smart Lock is created, and stored in the client class, its behaviour encapsulation functions are called. The create() function from BrandBLock notifies the user of the object's creation. ProductOrder's setBatteryCons() function passes the integer value read from the text file into the BrandBLock's setBatteryConsumption() function. The getBatteryCons() function from ProductOrder calls getBatteryConsumption() from BrandBLock, which returns the battery consumption value of the Smart Lock.



TEST RESULTS
<img width="3045" height="2223" alt="image" src="https://github.com/user-attachments/assets/694aefed-a5b5-4392-a015-ddacbf62fdfc" />










