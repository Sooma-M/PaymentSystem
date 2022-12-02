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
    exports com.javacode.AdminFunctionality.AddProvider;
    opens com.javacode.AdminFunctionality.AddProvider to javafx.fxml;
    exports com.javacode.UserFunctionallity.AddFunds;
    opens com.javacode.UserFunctionallity.AddFunds to javafx.fxml;
    exports com.javacode.UserFunctionallity.RefundRequest;
    opens com.javacode.UserFunctionallity.RefundRequest to javafx.fxml;
    exports com.javacode.AdminFunctionality.ManageRefunds;
    opens com.javacode.AdminFunctionality.ManageRefunds to javafx.fxml;
    exports com.javacode.Model;
    opens com.javacode.Model to javafx.fxml;
    exports com.javacode.UserFunctionallity.SelectService;
    opens com.javacode.UserFunctionallity.SelectService to javafx.fxml;
}