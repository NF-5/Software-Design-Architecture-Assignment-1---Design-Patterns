# Software-Design-Architecture-Assignment-1---Design-Patterns

Developed by Nicholas Furtado, Geraline Nazareth Chavez Reyes, Christopher Lui

The following assignment demonstrates an Abstract Factory design pattern through the modeling of locks and light bulbs (Smart home devices) from two different brands, A and B.

interface SmartLock: interface containing the method for returning battery consumption for both brands
interface LightBulb: interface containing the method for returning power usage for both brands

Brand A products:
 - class BrandALock: constructor for locks from brand A, containing a setter and implementing Smartlock to call batteryConsumption()
 - class BrandABulb: constructor for bulbs from brand A, containing a setter and implementing LightBulb to call powerUsage()

Brand B products:
 - class BrandBLock: constructor for locks from brand B, containing a setter and implementing Smartlock to call batteryConsumption()
 - class BrandBBulb: constructor for bulbs from brand B, containing a setter and implementing LightBulb to call powerUsage()

interface SmartHomeFactory
 - interface for creating new objects

class BrandAFactory
 - implements SmartHomeFactory to create locks and bulbs from Brand A

class BrandBFactory
 - implements SmartHomeFactory to create locks and bulbs from Brand B

SmartHomeTest
 - Test driver, calls methods to create a bulb from brand A and a lock from brand B, and returns their power usage/battery consumption


<img width="1321" height="438" alt="Screenshot 2025-09-22 023359" src="https://github.com/user-attachments/assets/8d4d7185-7162-4cf6-b7b7-188c41c65c0b" />

Please refer to DesignAssignment1.pdf for full screendump

