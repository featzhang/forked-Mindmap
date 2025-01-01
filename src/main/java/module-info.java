module Mindmap {
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires java.logging;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;

    exports mindmap to javafx.graphics;
    opens mindmap.controller to javafx.fxml;

    exports mindmap.model to com.fasterxml.jackson.databind;
}