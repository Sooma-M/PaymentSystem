module com.javacode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javacode to javafx.fxml;
    exports com.javacode;
}