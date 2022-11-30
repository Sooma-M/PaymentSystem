module com.javacode {
    opens com.javacode to javafx.fxml;
    exports com.javacode;
    exports com.javacode.Sign;
    opens com.javacode.Sign to javafx.fxml;
    exports com.javacode.UserFunctionallity;
    opens com.javacode.UserFunctionallity to javafx.fxml;
    exports com.javacode.Services;
    opens com.javacode.Services to javafx.fxml;
    exports com.javacode.UserFunctionallity.Search;
    opens com.javacode.UserFunctionallity.Search to javafx.fxml;
    exports com.javacode.Payment;
    opens com.javacode.Payment to javafx.fxml;
}