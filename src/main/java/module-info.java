module v.audioplayer3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens v.audioplayer3 to javafx.fxml;
    exports v.audioplayer3;
}