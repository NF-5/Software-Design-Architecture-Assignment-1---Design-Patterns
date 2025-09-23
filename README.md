# Software-Design-Architecture-Assignment-1---Design-Patterns

Developed by Nicholas Furtado(100908880), Geraline Nazareth Chavez Reyes(100890130), Christopher Lui (100912564)

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

   
<img width="2387" height="2105" alt="Screenshot 2025-09-22 023134" src="https://github.com/user-attachments/assets/187381f2-33af-441c-9514-45b2929b5f90" />
<img width="2459" height="2107" alt="Screenshot 2025-09-22 023144" src="https://github.com/user-attachments/assets/5604f5cc-709b-4b30-9012-9817fd3d734b" />
<img width="2382" height="1767" alt="Screenshot 2025-09-22 023223" src="https://github.com/user-attachments/assets/1a239267-0323-4c13-a762-72dd5ac32441" />
<img width="2453" height="1698" alt="Screenshot 2025-09-22 023255" src="https://github.com/user-attachments/assets/e7b961e3-20f1-4282-87bf-49ef0b49c53c" />
<img width="2296" height="863" alt="Screenshot 2025-09-22 023334" src="https://github.com/user-attachments/assets/eb769a31-ee25-47b1-88ea-bd9829018232" />
<img width="2445" height="1496" alt="Screenshot 2025-09-22 023344" src="https://github.com/user-attachments/assets/34615f78-0412-415e-be90-0369932a3125" />


<img width="1321" height="438" alt="Screenshot 2025-09-22 023359" src="https://github.com/user-attachments/assets/8d4d7185-7162-4cf6-b7b7-188c41c65c0b" />





