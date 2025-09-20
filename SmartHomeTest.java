interface smartLock 
{
    void batteryConsumption();
    void specs();
}

interface lightBulb
{
    void powerUsage();
}

//Brand A products
class BrandALock implements smartLock 
{
    @Override
    public void batteryConsumption() 
    {

    }

    @Override
    public void specs() 
    {
       
    }
}

class BrandABulb implements lightBulb
{
    @override
    public void powerUsage()
    {
        System.out.println("The power usage from the bulb from brand A is " + aPower)    
    }

//Brand B products
class BrandBLock implements smartLock 
{
    @Override
    public void batteryConsumption() 
    {
    
    }

    @Override
    public void specs() 
    {
       
    }
}

//Place holder for Brand B lightbulb

//Abstract Factory Interface
interface SmartHomeFactory 
{
    smartLock createLock();
    //Place holder for lightbulb creation method
}   
//Factory for Brand A
class BrandAFactory implements SmartHomeFactory 
{
    @Override
    public smartLock createLock() 
    {
        return new BrandALock();
    }

    //Place holder for lightbulb creation method
}

//Factory for Brand B
class BrandBFactory implements SmartHomeFactory 
{
    @Override
    public smartLock createLock() 
    {
        return new BrandBLock();
    }

    //Place holder for lightbulb creation method
}

//Test Driver for Smart Home System
public class SmartHomeTest {
    public static void main(String[] args) {
        //Place holder for lock
        
        //Place holder for lightbulb 
    }
    
}
