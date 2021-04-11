package de.ungefroren.JMacros.api;

import de.ungefroren.JMacros.api.configuration.Configurable;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.nio.file.Path;
import java.util.List;

public interface Macro extends Configurable {

    String getName();

    KeyCode getKeyCode();

    Color getColor();

    Path getImageUrl();

    List<Action> getActions();
}
