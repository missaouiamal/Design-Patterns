package BehavioralPatterns.Mediator;

public class Button extends UIControl {
    public Button(DialogBox owner) {
        super(owner);
    }

    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        owner.changed(this);
    }
}
