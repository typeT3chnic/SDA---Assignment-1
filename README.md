# Software Design and Architecture---Assignment-1

Jayden Mallari (100927861)

Rabab Raza (100932792)

CRN: 45740

Group 4


INTRODUCTION

This assignment demonstrates the use of design patterns, specifically the abstract factory pattern and the factory method pattern, to create smart home devices for specific brands (i.e. Brand A, Brand B). Each brand distribute a family of products including Smart Bulbs and Smart Locks.



CODE STRUCTURE

The SmartDeviceFactory.java folder contains the SmartDeviceFactory interface which includes the the createBulb() and createLock() methods. When called, those methods will return an instance of either a SmartBulb or SmartLock respectively for whatever SmartDeviceFactory Brand object calls it. These methods are inhereted by the BrandAFactory and BrandBFactory classes which call these methods.

The AbstractProducts.java contains interfaces representing the Smart Bulb and Smart Lock, which are implemented by the concrete product classes, BrandABulb, BrandBBulb, BrandALock and BrandBLock. The instances returned depends on which factory class is creating them (ex: the SmartDeviceFactory object is the instance of BRandAFactory, therefore, the methods will return an instance of either the BrandABulb or BrandALock classes.

The ProductOrder class is the client code that interacts with the Factory classes and calls their methods depending on what factory object and the type of product (bulb or lock) is being passed through it.



TEST METHODS

In addition to the main structure, test classes were developed for state/return-value testing for the SmartDeviceFactory, SmartLock and SmartBulb and all of the classes that implemented them. These test classes include:

TestSmartBulb.java

TestSmartLock.java

SmartDeviceFactoryTest.java

ProductOrderTest.java


The assertEquals() function tests for an expected value by instantiating a test object and calling the getter method of that object's instance. That is how the setter and getter methods for the SmartBulb and SmartLock classes are tested at the same time. This is used in TestSmartLock, TestSmartBulb and ProductOrderTest.

The @Test functions in the SmartDeviceFactorytest.java incorporate the assertNotNull() and assertInstanceOf() methods. The assertNotNull() method verifies whether a value is not null. This is to test that the SmartDeviceFactory classes actually returned any instances of either SmartBulb or SmartLock objects. The assertInstanceOf() method helped in this by making sure the correctness of the instances returned. For example, when asked to create a smart bulb for Brand A, the program does not return a smart lock for Brand B.


SCREENDUMP OF TEST RESULTS

TestSmartBulb.java

<img width="3057" height="2196" alt="image" src="https://github.com/user-attachments/assets/3e8e44b5-25ba-4631-af20-b3643db751fe" />


TestSmartLock.java

<img width="3090" height="1979" alt="image" src="https://github.com/user-attachments/assets/c502460a-6ffa-4565-8f76-ef3505f2c0fb" />


SmartDeviceFactoryTest.java

<img width="2798" height="1900" alt="image" src="https://github.com/user-attachments/assets/7fc53795-b90f-4985-a2ed-b01534065160" />


ProductOrderTest.java










