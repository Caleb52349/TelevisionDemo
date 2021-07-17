// The purpose of this class is to model a television
// Caleb Danso

public class Television {
    private static String MANUFACTURER;
    private static int SCREEN_SIZE;
    private  boolean powerOn;
    private static  int channel;
    private static   int volume;


    /*Set the channel of the television*/

    public Television(String brand, int size)
    {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false; //Set default values of the television
        volume= 20; //default volume set to 20;
        channel=2; //default value of channel set to 2
    }

    public void setChannel(int station)
    {
        channel = station;
    }

    public void power()
    {
        powerOn = !powerOn;
    }

    public void increaseVolume()
    {
     volume = volume+1;
    }

    public void decreaseVolume()
    {
        volume = volume-1;
    }

    public int getChannel()
    {
        return  channel;
    }

    public int getVolume()
    {
        return volume;
    }

    public String getManufacturer()
    {
        return  MANUFACTURER;
    }

    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }

}
