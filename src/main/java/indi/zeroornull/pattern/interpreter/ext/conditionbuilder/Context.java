package indi.zeroornull.pattern.interpreter.ext.conditionbuilder;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, String> data = new HashMap<>();

    public void setVariable(String key, String value) {
        data.put(key, value);
    }

    public String getVariable(String key) {
        return data.get(key);
    }
}
