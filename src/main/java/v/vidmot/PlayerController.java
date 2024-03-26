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
import v.vinnsla.Lagalisti;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class PlayerController {
    @FXML
    private Button lagalisti;


    @FXML
    private Button fxAskrifandi;

    private ListView<String> listView = new ListView<>();

    public void initialize(){

    }

    public void onVeljaLista(ActionEvent mouseEvent){
        Button reitur = (Button) mouseEvent.getSource();
        int i = GridPane.getRowIndex(reitur);

        if (i==0){
            System.out.println("valið var Lagalista 1");

            //ef valið er lagalista 1 þa er farið í þennan glugga


        } else if (i==1) {
            System.out.println("valið var Lagalista 2");

            //ef vali' er lagalista 2 þá er farið í gluggan sem tengir við það

        }

        ViewSwitcher.switchTo(View.LISTI);

    }


    public void onLogin(MouseEvent event){
        Dialog<Askrifandi> dialog = new AskrifandiDialog(new Askrifandi(null));
        Optional<Askrifandi> utkoma = dialog.showAndWait();
        utkoma.ifPresent(value -> fxAskrifandi.setText(value.getNafn()));
        }
}
