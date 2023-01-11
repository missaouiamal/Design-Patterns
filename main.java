
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
import BehavioralPatterns.Mediator.ArticleDialogBox;
import BehavioralPatterns.Memento.Editor;
import BehavioralPatterns.Observer.Chart;
import BehavioralPatterns.Observer.DataSource;
import BehavioralPatterns.Observer.SpreadSheet;
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
import StructuralPatterns.Adapter.CaramelFilter;
import StructuralPatterns.Adapter.Image;
import StructuralPatterns.Adapter.ImageView;
import StructuralPatterns.Adapter.avaFilters.Caramel;
import StructuralPatterns.Bridge.LGTV;
import StructuralPatterns.Bridge.RemoteControl;
import StructuralPatterns.Bridge.SonyTV;
import StructuralPatterns.Composite.Group;
import StructuralPatterns.Composite.Shape;
import StructuralPatterns.Decorator.CloudStream;
import StructuralPatterns.Decorator.CompressedCloudStream;
import StructuralPatterns.Decorator.EncryptedCloudStream;
import StructuralPatterns.Decorator.Stream;
import StructuralPatterns.Facade.NotificationService;
import StructuralPatterns.Flyweight.Point;
import StructuralPatterns.Flyweight.PointIconFactory;
import StructuralPatterns.Flyweight.PointService;
import StructuralPatterns.Proxy.EbookProxy;
import StructuralPatterns.Proxy.Library;

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
    // HtmlDocument document = new HtmlDocument();
    // document.add(new HeadingNode());
    // document.add(new AnchorNode());
    // document.execute(new PlainTextOperation());

//************************************************************** *//
    // OBSERVER PATTERN
    // DataSource dataSource = new DataSource();
    // SpreadSheet sheet1 = new SpreadSheet();
    // SpreadSheet sheet2 = new SpreadSheet();
    // Chart chart = new Chart();

    // dataSource.addObserver(sheet1);
    // dataSource.addObserver(sheet2);
    // dataSource.addObserver(chart);

    // dataSource.setValue(20);

//************************************************************** *//
    // MEDIATOR PATTERN
    // ArticleDialogBox dialog = new ArticleDialogBox();
    // dialog.simulateUserInteraction();

//************************************************************** *//
    // COMPOSITE PATTERN
    // Group groupe1 = new Group();
    // groupe1.add(new Shape());
    // groupe1.add(new Shape());

    // Group groupe2 = new Group();
    // groupe2.add(new Shape());
    // groupe2.add(new Shape());
    
    // Group group = new Group();
    // group.add(groupe1);
    // group.add(groupe2);
    // group.render();

//************************************************************** *//
    // ADAPTER PATTERN
    // ImageView imageView = new ImageView(new Image());
    // imageView.apply(new CaramelFilter(new Caramel()));

//************************************************************** *//
    // DECORATOR PATTERN
    // storeCreditCard(new EncryptedCloudStream( new CompressedCloudStream( new CloudStream())));

//************************************************************** *//   
    // FACADE PATTERN
    // NotificationService service = new NotificationService();
    // service.send("Hello World","target");

//************************************************************** *//
    // FLYWEIGHT PATTERN
    // PointService service = new PointService(new PointIconFactory());
    // for (Point point : service.getPoints()) {
    //     point.draw();
    // }

//************************************************************** *//   
    // BRIDGE PATTERN
    // RemoteControl remoteControl = new RemoteControl(new LGTV());
    // remoteControl.turnOn();

//************************************************************** *//   
    // PROXY PATTERN
    Library library = new Library();
    String[] fileNames = {"a","b","c"};
    for(String fileName : fileNames) {
        library.add(new EbookProxy(fileName));
    }
    library.openEbook("a");
    library.openEbook("b");

   } 
    // RELATED TO DECORATOR PATTERN
//    public static void storeCreditCard(Stream stream) {
//     stream.write("123-1234-1234-1234");
//    }

}
