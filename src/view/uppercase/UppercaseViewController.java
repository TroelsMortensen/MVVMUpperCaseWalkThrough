package view.uppercase;

import core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UppercaseViewController {

    public TextField inputField;
    public TextField outputField;
    public Label errorLabel; // todo show popup instead?
    private ViewHandler viewHandler;
    private UppercaseViewModel uppercaseVM;

    public void init(ViewHandler viewHandler, UppercaseViewModel uppercaseVM) {
        this.viewHandler = viewHandler;
        this.uppercaseVM = uppercaseVM;
        inputField.textProperty().bindBidirectional(uppercaseVM.requestProperty());
        outputField.textProperty().bindBidirectional(uppercaseVM.replyProperty());
        errorLabel.textProperty().bind(uppercaseVM.errorProperty());
    }

    public void onConvertButton() {
        uppercaseVM.convert();
    }

    public void onLogButton() {
        viewHandler.openLogView();
    }
}
