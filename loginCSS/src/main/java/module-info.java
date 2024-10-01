module es.ieslosmontecillos.logincss {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.logincss to javafx.fxml;
    exports es.ieslosmontecillos.logincss;
}