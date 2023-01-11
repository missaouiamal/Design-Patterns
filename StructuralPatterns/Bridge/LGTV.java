package StructuralPatterns.Bridge;

public class LGTV implements Device{

    @Override
    public void turnOn() {
        System.out.println("LG: TurnOn");
    }

    @Override
    public void turnoOff() {
        System.out.println("LG: TurnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("LG: setChannel"); 
    }
    
}
