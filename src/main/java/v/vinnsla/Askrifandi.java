package v.vinnsla;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import v.vidmot.View;
import v.vidmot.ViewSwitcher;

// tengis AskrifandiDialog<Askrifandi>   og það tengist Dialog Pane
//tengist líka askrifandi-view.fxml    (lýsir Dialog Pane???)))
public class Askrifandi {


    private final StringProperty nafn = new SimpleStringProperty();

    /**
     * Fallið býr til nýjan áskrifanda
     * @param nafn
     */

    public Askrifandi(String nafn){
        setNafn(nafn);
    }

    public String getNafn() {
        return nafn.get();
    }


    public void setNafn(String nafn) {
        this.nafn.set(nafn);
    }
}
