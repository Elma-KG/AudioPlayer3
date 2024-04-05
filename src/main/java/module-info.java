module v.audioplayer3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens v.vidmot to javafx.fxml, javafx.media;
    exports v.vidmot;

    opens v.vinnsla to javafx.fxml;
    exports v.vinnsla;


}