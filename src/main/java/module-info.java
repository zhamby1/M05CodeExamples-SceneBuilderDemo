module com.example.scenebuilderdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.scenebuilderdemo to javafx.fxml;
    exports com.example.scenebuilderdemo;
}