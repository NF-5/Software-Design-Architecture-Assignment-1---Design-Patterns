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
    @Override
    public void batteryConsumption()
    {

    }

    @Override
    public void specs()
    {

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
    smartLock createLock();
    lightBulb createBulb();
}
//Factory for Brand A
class BrandAFactory implements SmartHomeFactory
{
    private int aPower;

    @Override
    public smartLock createLock()
    {
        return new BrandALock();
    }

    @Override
    public lightBulb createBulb()
    {
        return new BrandABulb(aPower);
    }
}

//Factory for Brand B
class BrandBFactory implements SmartHomeFactory
{
    private int bPower;

    @Override
    public smartLock createLock()
    {
        return new BrandBLock();
    }

    @Override
    public lightBulb createBulb()
    {
        return new BrandBBulb(bPower);
    }
}

//Test Driver for Smart Home System
public class SmartHomeTest {
    public static void main(String[] args) {

        int aPower = 50;
        int bPower = 70;

        BrandABulb bulb1 = new BrandABulb(aPower);
        bulb1.powerUsage();

        BrandBBulb bulb2 = new BrandBBulb(bPower);
        bulb2.powerUsage();
    }

}
