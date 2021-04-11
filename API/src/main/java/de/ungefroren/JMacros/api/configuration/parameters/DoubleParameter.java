package de.ungefroren.JMacros.api.configuration.parameters;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class DoubleParameter extends Parameter<Double> {

    public DoubleParameter(String id, String label, String description) {
        super(id, label, description);
    }

    public DoubleParameter(String id, String label, String description, double defaultVal) {
        super(id, label, description, defaultVal);
    }

    @Override
    public JsonElement serialize() {
        return new JsonPrimitive(getValue());
    }

    @Override
    public void deserialize(JsonElement json) throws Exception {
        setValue(json.getAsDouble());
    }
}
