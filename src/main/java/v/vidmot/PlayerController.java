package v.vidmot;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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
    protected Button fxAskrifandi;



    public void initialize(){
        Lagalistar.frumstilla();

    }

    @FXML
    public void onVeljaLista(ActionEvent mouseEvent){

        int i = GridPane.getRowIndex((Node) mouseEvent.getSource());
        int j = GridPane.getColumnIndex((Node) mouseEvent.getSource());
        // skiptum yfir í lagalistann í vinnslunni sem var valið
        Lagalistar.setIndex(i * 2 + j);
        // skiptum yfir í LAGALISTI view
        ViewSwitcher.switchTo(View.LISTI, false);
        /**Button reitur = (Button) mouseEvent.getSource();
        int i = GridPane.getRowIndex(reitur);
        int j = GridPane.getColumnIndex(reitur);

        Lagalistar.setIndex(i*2+j);


        ViewSwitcher.switchTo(View.LISTI);*/

    }


    public void onLogin(){
        AskrifandiDialog dialog = new AskrifandiDialog(new Askrifandi(ASKRIFANDI));
        // sýndu dialoginn
        Optional<Askrifandi> utkoma = dialog.showAndWait();
        // Ef fékkst svar úr dialognum setjum við nafnið á áskrifandanum í notendaviðmótið
        utkoma.ifPresent (a -> {
            fxAskrifandi.setText(a.getNafn());});

    }
}
