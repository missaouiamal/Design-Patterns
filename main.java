
import BehavioralPatterns.ChainOfResponsibility.Authenticator;
import BehavioralPatterns.ChainOfResponsibility.Compressor;
import BehavioralPatterns.ChainOfResponsibility.Encryptor;
import BehavioralPatterns.ChainOfResponsibility.HttpRequest;
import BehavioralPatterns.ChainOfResponsibility.Logger;
import BehavioralPatterns.ChainOfResponsibility.WebServer;
import BehavioralPatterns.Command.AddCustomerCommand;
import BehavioralPatterns.Command.BlackAndWhiteCommand;
import BehavioralPatterns.Command.CompositeCommand;
import BehavioralPatterns.Command.CustomerService;
import BehavioralPatterns.Command.ResizeCommand;
import BehavioralPatterns.Command.editor.BoldCommand;
// import BehavioralPatterns.Command.editor.HtmlDocument;
import BehavioralPatterns.Command.editor.UndoCommand;
import BehavioralPatterns.Command.editor.History;
import BehavioralPatterns.Command.fx.Button;
import BehavioralPatterns.Command.fx.Command;
import BehavioralPatterns.Iterator.BrowseHistory;
import BehavioralPatterns.Iterator.Iterator;
import BehavioralPatterns.Memento.Editor;
// import BehavioralPatterns.Memento.History;
import BehavioralPatterns.State.Canvas;
import BehavioralPatterns.State.EraserTool;
import BehavioralPatterns.State.SelectionTool;
import BehavioralPatterns.Strategy.BlackAndWhiteFilter;
import BehavioralPatterns.Strategy.ImageStorage;
import BehavioralPatterns.Strategy.JpegCompressor;
import BehavioralPatterns.Strategy.PngCompressor;
import BehavioralPatterns.TemplateMethod.Task;
import BehavioralPatterns.TemplateMethod.TransferMoneyTask;
import BehavioralPatterns.Visitor.AnchorNode;
import BehavioralPatterns.Visitor.HeadingNode;
import BehavioralPatterns.Visitor.HighlightOperation;
import BehavioralPatterns.Visitor.HtmlDocument;
import BehavioralPatterns.Visitor.PlainTextOperation;

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
    // BrowseHistory history = new BrowseHistory();
    // history.push("WWW.google.com");
    // history.push("WWW.linkedin.com");
    // history.push("WWW.youtube.com");

    // Iterator iterator = history.createIterator();
    // while(iterator.hasNext()) {
    //     String url = iterator.current();
    //     System.out.println(url);
    //     iterator.next();
    // }

//************************************************************** *//
    // STRATEGY PATTERN 
    // ImageStorage imageStorage = new ImageStorage();
    // imageStorage.store("a",new JpegCompressor(), new BlackAndWhiteFilter());
    // imageStorage.store("a",new PngCompressor(), new BlackAndWhiteFilter());

//************************************************************** *//
    // TEMPLATE METHOD PATTERN 
    // Task task = new TransferMoneyTask();
    // task.execute();

//************************************************************** *//
    // COMMAND PATTERN
    // CompositeCommand composite = new CompositeCommand();
    // composite.add(new ResizeCommand());
    // composite.add(new BlackAndWhiteCommand());
    // composite.execute();

    // UNDOABLE COMMAND
//     History history = new History();
//     HtmlDocument document = new HtmlDocument();
//     document.setContent("Hello World");

//     BoldCommand boldCommand = new BoldCommand(document, history);
//     boldCommand.execute();
//     System.out.println(document.getContent());

//    UndoCommand undoCommand = new UndoCommand(history);
//    undoCommand.execute();
//    System.out.println(document.getContent());

//************************************************************** *//
    // CHAIN OF RESPONSIBILITY PATTERN
    // Authenticator -> Compressor -> Encryptor
    // Encryptor encyptor = new Encryptor(null);
    // Compressor compressor = new Compressor(encyptor);
    // // Logger logger = new Logger(compressor);
    // Authenticator Authenticator = new Authenticator(compressor);
    // WebServer server = new WebServer(Authenticator);
    // server.handle(new HttpRequest("admin", "1234"));

//************************************************************** *//
    // VISITOR PATTERN 
    HtmlDocument document = new HtmlDocument();
    document.add(new HeadingNode());
    document.add(new AnchorNode());
    document.execute(new PlainTextOperation());
   } 
}
