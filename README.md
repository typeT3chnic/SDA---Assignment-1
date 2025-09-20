# Software Design and Architecture---Assignment-1

Jayden Mallari (100927861)

Rabab Raza (100932792)

CRN: 45740

Group 4


INTRODUCTION

This assignment demonstrates the use of design patterns, specifically the abstract factory pattern and the factory method pattern, to create smart home devices for specific brands (i.e. Brand A, Brand B). Each brand distribute a family of products including Smart Bulbs and Smart Locks.



CODE STRUCTURE

The SmartDeviceFactory.java folder contains the SmartDeviceFactory interface which includes the the createBulb() and createLock() methods. When called, those methods will return an instance of either a SmartBulb or SmartLock respectively for whatever SmartDeviceFactory Brand object calls it. These methods are inhereted by the BrandAFactory and BrandBFactory classes which call these methods.



The ProductOrder class is the client code that interacts with the Factory classes and calls their methods depending on what factory object and the type of product (bulb or lock) is being passed through it.



TEST METHODS

To ensure all classes and interfaces were functioning as intended, you will find a TestDriver class to run the code. As per assignment instructions, test methods and instantiations were called to demonstrate the creation of a Smart Bulb from Brand A and a Smart Lock from Brand B.

For the first example, factory, a BrandAFactory object implementing the SmartDeviceFactory interface is created, which only creates Brand A devices (smart bulbs and locks). Next, a ProductOrder (client class) object, "fstOrder," is created with the BrandAFactory 'factory' and "bulb" as arguments. Inside ProductOrder's constructer, due to the BrandAFactory and parameter, "bulb", it calls factory.createBulb() which in this case, executes BrandAFactory.createBulb().
Now, fstOrder has a SmartBulb stored within this.bulb as a BrandABulb object.

After the successful creation of the SmartBulb, fstOrder.createProducts() 




TEST RESULTS









