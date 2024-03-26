package v.audioplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PlayerController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button lagalisti;

    @FXML
    protected void onAskrifandiButton() {
        lagalisti.setText("virkar");
    }


    @FXML
    private void onLagalistiButton(){
        lagalisti.setText("idk");
    }

    @FXML
    private void onLagalisti1(){
        System.out.println("virkar");
    }

    @FXML
    private void onLagalisti2(){
        System.out.println("virkar");
    }


}