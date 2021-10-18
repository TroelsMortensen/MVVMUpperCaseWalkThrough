package view.uppercase;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.TextConverter;

public class UppercaseViewModel {

    private StringProperty request = new SimpleStringProperty();
    private StringProperty reply = new SimpleStringProperty();
    private StringProperty error = new SimpleStringProperty();

    private TextConverter textConverterModel;

    public UppercaseViewModel(TextConverter textConverterModel) {
        this.textConverterModel = textConverterModel;
    }

    public void convert() {
        String requestValue = request.getValue();
        if(requestValue == null || "".equals(requestValue)) {
            error.setValue("Input field cannot be empty");
            return;
        }

        String uppercasedText = textConverterModel.toUppercase(requestValue);
        request.set("");
        reply.setValue(uppercasedText);
        error.setValue("");
    }

    public StringProperty requestProperty() {
        return request;
    }

    public StringProperty replyProperty() {
        return reply;
    }

    public StringProperty errorProperty() {
        return error;
    }
}
