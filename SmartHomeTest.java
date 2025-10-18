interface smartLock 
{
    void batteryConsumption();
    void specs();
}

//Place holder for lightbulb interface  

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

//Place holder for Brand A lightbulb

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