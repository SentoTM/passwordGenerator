module com.sentotm.passwordgenerator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sentotm.passwordgenerator to javafx.fxml;
    exports com.sentotm.passwordgenerator;
}
