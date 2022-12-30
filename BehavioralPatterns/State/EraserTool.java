package BehavioralPatterns.State;

public class EraserTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
        
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something ..");
        
    }
    
}
