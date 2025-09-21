interface smartLock
{
    void batteryConsumption();
}

interface lightBulb
{
    void powerUsage();
}

//Brand A products
class BrandALock implements smartLock
{
    int aBattery;

    public BrandALock(int aBattery) 
    {
        this.aBattery = aBattery;
    }

    @Override
    public void batteryConsumption()
    {
        System.out.println("The battery consumption from brand A is " + aBattery + "W.");
    }

}

class BrandABulb implements lightBulb
{
    int aPower;

    public BrandABulb(int aPower) {
        this.aPower = aPower;
    }

    @Override
    public void powerUsage()
    {
        System.out.println("The power usage from the bulb from brand A is " + aPower + "W.");
    }
}
//Brand B products
class BrandBLock implements smartLock
{
    int bBattery;
    public BrandBLock(int bBattery) 
    {
        this.bBattery = bBattery;
    }

    @Override
    public void batteryConsumption()
    {
        System.out.println("The battery consumption from the lock from brand B is " + bBattery + "W.");
    }

}

class BrandBBulb implements lightBulb
{
    int bPower;

    public BrandBBulb(int bPower) {
        this.bPower = bPower;
    }

    @Override
    public void powerUsage()
    {
        System.out.println("The power usage from the bulb from brand B is " + bPower + "W.");
    }
}

//Abstract Factory Interface
interface SmartHomeFactory
{
    smartLock createLock(int battery);
    lightBulb createBulb(int power);
}

//Factory for Brand A
class BrandAFactory implements SmartHomeFactory
{
    @Override
    public smartLock createLock(int battery)
    {
        return new BrandALock(battery);
    }

    @Override
    public lightBulb createBulb(int power)
    {
        return new BrandABulb(power);
    }
}

//Factory for Brand B
class BrandBFactory implements SmartHomeFactory
{
    @Override
    public smartLock createLock(int battery)
    {
        return new BrandBLock(battery);
    }

    @Override
    public lightBulb createBulb(int power)
    {
        return new BrandBBulb(power);
    }
}

//Test Driver for Smart Home System
public class SmartHomeTest {
    public static void main(String[] args) {

        int aPower = 50;
        int bPower = 70;

        int aBattery = 20;
        int bBattery = 30;

        SmartHomeFactory brandAFactory = new BrandAFactory();
        SmartHomeFactory brandBFactory = new BrandBFactory();

        lightBulb bulb1 = brandAFactory.createBulb(aPower);
        bulb1.powerUsage();

        lightBulb bulb2 = brandBFactory.createBulb(bPower);
        bulb2.powerUsage();

        smartLock lock1 = brandAFactory.createLock(aBattery);
        lock1.batteryConsumption();

        smartLock lock2 = brandBFactory.createLock(bBattery);
        lock2.batteryConsumption();
    }

}
