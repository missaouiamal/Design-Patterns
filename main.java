
import BehavioralPatterns.Iterator.BrowseHistory;
import BehavioralPatterns.Iterator.Iterator;
import BehavioralPatterns.Memento.Editor;
import BehavioralPatterns.Memento.History;
import BehavioralPatterns.State.Canvas;
import BehavioralPatterns.State.EraserTool;
import BehavioralPatterns.State.SelectionTool;

public class main {
   public static void main(String[] args) {

//************************************************************** *//
    // MEMENTO PATTERN 
    // Editor editor = new Editor();
    // History history = new History();

    // editor.setContent("Monday");
    // history.push(editor.createState());

    // editor.setContent("Tuesday");
    // history.push(editor.createState());

    // editor.setContent("Wednesday");
    // editor.restore(history.pop());
    // System.out.println(editor.getContent());
    
//************************************************************** *//
    // STATE PATTERN 
    // OPEN CLOSED PRINCIPLE : Open for extension but closed for modification
    // Canvas canvas = new Canvas();
    // canvas.setCurTool(new SelectionTool());
    // canvas.mouseDown();
    // canvas.mouseUp();

    // canvas.setCurTool(new EraserTool());
    // canvas.mouseDown();
    // canvas.mouseUp();

//************************************************************** *//
    // ITERATOR PATTERN
    BrowseHistory history = new BrowseHistory();
    history.push("WWW.google.com");
    history.push("WWW.linkedin.com");
    history.push("WWW.youtube.com");

    Iterator iterator = history.createIterator();
    while(iterator.hasNext()) {
        String url = iterator.current();
        System.out.println(url);
        iterator.next();
    }
   } 
}
