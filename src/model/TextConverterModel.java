package model;

import java.util.ArrayList;
import java.util.List;

public class TextConverterModel implements TextConverter{

    private List<String> list = new ArrayList<>();

    @Override
    public String toUppercase(String text) {
        list.add(text);
        return text.toUpperCase();
    }

    @Override
    public List<String> getLogs() {
        return list;
    }
}
