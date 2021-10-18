package view.log;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.TextConverter;

import java.util.List;

public class LogViewModel {
    private ObservableList<String> logs = FXCollections.observableArrayList();
    private TextConverter textConverterModel;

    public LogViewModel(TextConverter textConverterModel) {

        this.textConverterModel = textConverterModel;
    }

    public void getLogs() {
        List<String> list = textConverterModel.getLogs();
        logs.clear();
        logs.addAll(list);
    }

    public ObservableList<String> getLogList() {
        return logs;
    }
}
