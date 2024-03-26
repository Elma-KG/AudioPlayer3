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

    private Askrifandi askrifandi;

    @FXML
    private TextField fxnafnTextField;   //fxNafn


    private ButtonType fxAskrifandi;    ///fILagi



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
        Node disableR= getDialogPane().lookupButton(fxAskrifandi);
        disableR.disableProperty().bind(fxnafnTextField.textProperty().isEmpty());
    }

    public Askrifandi getNafn(){
        Optional<Askrifandi> utkoma = showAndWait();
        return utkoma.orElse(null);

    }

    public AskrifandiDialog(Askrifandi a){
        super();
        this.askrifandi = a;

        this.setTitle("Innskráning");
        //bæta við viðmótið í dialogPane
        buildUI();
        setPropertyBinding();

        //setja niðurstöðu skoðunaraðferð
        setResultConverter();
    }

    private void buildUI() {
        getDialogPane().setContent(lesaDialog());
        getDialogPane().getButtonTypes().addAll(ButtonType.OK,ButtonType.CANCEL);

        Button button = (Button) getDialogPane().lookupButton(ButtonType.OK);
        button.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!valiidateDialog()){
                    actionEvent.consume();
                }
            }
        });

    }

    private boolean valiidateDialog() {
        return !fxnafnTextField.getText().isEmpty();
    }

    private void setPropertyBinding() {
        fxnafnTextField.textProperty().bindBidirectional(askrifandi.nafnProperty());
    }


    //tékkar hvor að það var sett eitthvað í textfield þar sem nafnið á að koma og hvort var ýtt á OK

    private void setResultConverter(){

        setResultConverter(b -> {
            if (b.getButtonData() == ButtonBar.ButtonData.OK_DONE){
                return askrifandi;
            }return null;
        });
    }

   
}
