import core.ModelFactory;
import core.ViewHandler;
import core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class UppercaseApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory mf = new ModelFactory();
        ViewModelFactory vmf = new ViewModelFactory(mf);
        ViewHandler viewHandler = new ViewHandler(vmf);
        viewHandler.start();
    }
}
