module org.example.ratmouse {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ratmouse to javafx.fxml;
    exports org.example.ratmouse;
}