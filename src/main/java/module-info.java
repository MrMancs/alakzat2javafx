module com.example.alakzat2javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.alakzat2javafx to javafx.fxml;
    exports com.example.alakzat2javafx;
}