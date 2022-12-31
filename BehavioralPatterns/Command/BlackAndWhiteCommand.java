package BehavioralPatterns.Command;

import BehavioralPatterns.Command.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
       System.out.println("Balck and White");
        
    }
    
}
