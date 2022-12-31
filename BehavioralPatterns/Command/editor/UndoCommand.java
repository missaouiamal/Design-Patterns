package BehavioralPatterns.Command.editor;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size()> 1) {
            history.pop().unexecute();
        }
    }
    
}
