package v.vidmot;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import v.vinnsla.Askrifandi;

import java.io.IOException;
import java.util.Optional;

public class AskrifandiDialog extends Dialog<Askrifandi> {

    private final Askrifandi askrifandi;

    @FXML
    protected TextField fxnafnTextField;   //fxNafn


    public DialogPane lesaDialog(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("askrifandi-view.fxml"));
        try {
            fxmlLoader.setController(this);
            return fxmlLoader.load();
        }catch (IOException exception){
            throw new RuntimeException(exception);
        }
    }

    private void disableRegla() {
        Node disableR= getDialogPane().lookupButton(ButtonType.OK);
        disableR.disableProperty().bind(fxnafnTextField.textProperty().isEmpty());
    }



    public AskrifandiDialog(Askrifandi a){
        super();
        this.askrifandi = a;

        this.setTitle("Innskráning");
        setDialogPane(lesaDialog());

        //setja niðurstöðu skoðunaraðferð
        setResultConverter();
    }



    private boolean valiidateDialog() {
        return !fxnafnTextField.getText().isEmpty();
    }



    //tékkar hvor að það var sett eitthvað í textfield þar sem nafnið á að koma og hvort var ýtt á OK

    private void setResultConverter(){

        setResultConverter(b -> {
            if (b.getButtonData() == ButtonBar.ButtonData.OK_DONE){
                askrifandi.setNafn(fxnafnTextField.getText());  //nær í nafnið úr dialog og setja í áskrifanda hlut
                return askrifandi;
            }return null;
        });
    }

   
}
