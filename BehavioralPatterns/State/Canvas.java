package BehavioralPatterns.State;

public class Canvas {
    private Tool curTool;

    public void mouseDown() {
        curTool.mouseDown();
    }

    public void mouseUp() {
        curTool.mouseUp();
    }

    public Tool getCurTool() {
        return curTool;
    }

    public void setCurTool(Tool curTool) {
        this.curTool = curTool;
    }
}
 