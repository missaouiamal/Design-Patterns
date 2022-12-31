package BehavioralPatterns.Command.editor;

public interface UndoableCommand extends Command {
    void unexecute();    
}
