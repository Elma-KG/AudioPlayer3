package v.vinnsla;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import v.vidmot.View;
import v.vidmot.ViewSwitcher;

// tengis AskrifandiDialog<Askrifandi>   og það tengist Dialog Pane
//tengist líka askrifandi-view.fxml    (lýsir Dialog Pane???)))
public class Askrifandi {


    private final StringProperty nafn = new SimpleStringProperty();

    public Askrifandi(String nafn){
        this.nafn.set(nafn);
    }

    public String getNafn() {
        return nafn.get();
    }

    public StringProperty nafnProperty() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn.set(nafn);
    }
}
