package core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.log.LogViewController;
import view.log.LogViewModel;
import view.uppercase.UppercaseViewController;

import java.io.IOException;

public class ViewHandler {

    private Scene uppercaseScene;
    private Scene logScene;
    private Stage stage;
    private ViewModelFactory vmf;
    private LogViewController logViewController;

    public ViewHandler(ViewModelFactory vmf) {
        this.vmf = vmf;
        stage = new Stage();
    }

    public void start() {
        openUppercaseView();
        stage.show();
    }

    public void openUppercaseView() {
        if (uppercaseScene == null) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/uppercase/UppercaseView.fxml"));
                Parent root = loader.load();

                UppercaseViewController controller = loader.getController();
                controller.init(this, vmf.getUppercaseVM());

                uppercaseScene = new Scene(root);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        stage.setScene(uppercaseScene);
        stage.setTitle("Upper Case Converter");
    }

    public void openLogView() {
        if (logScene == null) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/log/LogView.fxml"));
                Parent root = loader.load();

                logViewController = loader.getController();
                logViewController.init(this, vmf.getLogVM());
                logScene = new Scene(root);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        logViewController.reload();
        stage.setScene(logScene);
        stage.setTitle("Logs");
    }
}
