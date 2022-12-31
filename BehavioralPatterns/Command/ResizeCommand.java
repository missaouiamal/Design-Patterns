package BehavioralPatterns.Command;

import BehavioralPatterns.Command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
       System.out.println("Resize");
        
    }
    
}
