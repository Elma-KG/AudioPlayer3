package v.vidmot;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import v.vinnsla.Askrifandi;
import v.vinnsla.Lag;
import v.vinnsla.Lagalistar;
import v.vinnsla.Lagalisti;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class PlayerController {
    public static final String ASKRIFANDI = "Áskrifandi";



    @FXML
    private Button fxAskrifandi;



    public void initialize(){

    }

    public void onVeljaLista(ActionEvent mouseEvent){
        Button reitur = (Button) mouseEvent.getSource();
        int i = GridPane.getRowIndex(reitur);
        int j = GridPane.getColumnIndex(reitur);

        Lagalistar.setIndex(i*2+j);


        ViewSwitcher.switchTo(View.LISTI);

    }


    public void onLogin(MouseEvent event){
        Dialog<Askrifandi> dialog = new AskrifandiDialog(new Askrifandi(ASKRIFANDI));
        Optional<Askrifandi> utkoma = dialog.showAndWait();
        utkoma.ifPresent(value -> fxAskrifandi.setText(value.getNafn()));
        }
}
