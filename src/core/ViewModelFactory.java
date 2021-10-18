package core;

import view.log.LogViewModel;
import view.uppercase.UppercaseViewModel;

public class ViewModelFactory {
    private ModelFactory mf;

    public ViewModelFactory(ModelFactory mf) {
        this.mf = mf;
    }

    public UppercaseViewModel getUppercaseVM() {
        return new UppercaseViewModel(mf.getTextConverterModel());
    }

    public LogViewModel getLogVM() {
        return new LogViewModel(mf.getTextConverterModel());
    }
}
