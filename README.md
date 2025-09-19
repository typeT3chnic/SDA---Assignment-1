# SDA---Assignment-1

INTRODUCTION

This assignment demonstrates the use of design patterns, specifically the abstract factory pattern and the factory method pattern, to create smart home devices for specific brands (i.e. Brand A, Brand B). Each brand distribute a family of products including Smart Bulbs and Smart Locks.



CODE STRUCTURE

The SmartDeviceFactory.java folder contains the SmartDeviceFactory interface which includes the the createBulb() and createLock() methods. When called, those methods will return an instance of either a SmartBulb or SmartLock respectively for whatever SmartDeviceFactory Brand object calls it. These methods are inhereted by the BrandAFactory and BrandBFactory classes which call these methods.

The AbstractProducts.java contains interfaces representing the Smart Bulb and Smart Lock, which are implemented by the concrete product classes, BrandABulb, BrandBBulb, BrandALock and BrandBLock. The instances returned depends on which factory class is creating them (ex: the SmartDeviceFactory object is the instance of BRandAFactory, therefore, the methods will return an instance of either the BrandABulb or BrandALock classes.

The ProductOrder class is the client code interacts with the Factory classes and calls their methods depending on what factory object and product is being passed through it.



TEST METHODS

  
