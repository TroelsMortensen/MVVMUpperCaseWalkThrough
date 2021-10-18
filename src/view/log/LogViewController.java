package view.log;

import core.ViewHandler;
import javafx.scene.control.ListView;

public class LogViewController {

    public ListView<String> logView;
    private ViewHandler viewHandler;
    private LogViewModel viewModel;

    public void init(ViewHandler viewHandler, LogViewModel viewModel) {
        this.viewHandler = viewHandler;
        this.viewModel = viewModel;
        logView.setItems(viewModel.getLogList());
    }

    public void onBackButton() {
        viewHandler.openUppercaseView();
    }

    public void reload() {
        viewModel.getLogs();
    }
}
