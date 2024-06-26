package v.vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import v.vinnsla.Askrifandi;

import java.io.IOException;
import java.util.Optional;

public class PlayerApplication extends Application {

    /**
     * Fall til að ræsa forritið
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PlayerApplication.class.getResource("heima-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);

        ViewSwitcher.setScene(scene);
        ViewSwitcher.switchTo(View.HEIMA, true);

        stage.setTitle("Audio Player");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}