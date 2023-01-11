package StructuralPatterns.Bridge;

public class SonyTV implements Device{

    @Override
    public void turnOn() {
        System.out.println("Sony: TurnOn");
    }

    @Override
    public void turnoOff() {
        System.out.println("Sony: TurnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: setChannel");
    }
    
}
