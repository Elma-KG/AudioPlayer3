package v.vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import v.vinnsla.Lag;
import v.vinnsla.Lagalisti;

public class ListiController {


    @FXML
    private ListView<Lag> fxListView;
    @FXML
    private Lag validLag;

    private Lagalisti lagalisti;

    @FXML
    private MediaPlayer mediaPlayer;

    private ProgressBar progressBar;


    /**
     * Frumstillir lagalistann og tengir hann við ListView viðmótshlut
     */

    public void initialize() {
        lagalisti = new Lagalisti();
        fxListView.setItems(lagalisti.getLagListi());
    }

    /**
     * Bregðast við músaratburði og spila valið lag
     *
     * @param mouseEvent
     */
    @FXML
    void onValidLag(MouseEvent mouseEvent) {
        veljaLag();
        spilaLag();
    }

    /**
     * Lætur laga lista vita hvert valda lagið er. Uppfærir myndina fyrir lagið.
     */
    private void veljaLag() {
        validLag = fxListView.getSelectionModel().getSelectedItem();

    }

    /**
     * Lagið er pásað ef það er í spilun, lagið er spilað ef það er í pásu
     *
     * @param actionEvent ónotað
     */
    private void onPlayPause(ActionEvent actionEvent) {


    }

    /**
     * Fara aftur í heima view. Ef spilari er til stöðva spilarann
     *
     * @param mouseEvent ónotað
     */
    @FXML
    public void onHeim(MouseEvent mouseEvent) {
        if (mediaPlayer != null){
            mediaPlayer.stop();
        }
        ViewSwitcher.switchTo(View.HEIMA);

    }

    /**
     * Spila lagið
     */
    private void spilaLag() {


    }

    /**
     * Setja mynd með nafni á ImageView
     *
     * @param fxImageView viðmótshluturinn sem á að uppfærast
     * @param nafnMynd    nafn á myndinni
     */
    //void setjaMynd(ImageView fxImageView, String nafnMynd) {

    //}

    /**
     * Setja upp player fyrir lagið, þ.m.t. at setja handler á hvenær lagið stoppar
     * og tengja
     * lagið við progress bar
     */
    private void setjaPlayer() {
        if (mediaPlayer != null){
            mediaPlayer.stop();
        }


    }
    /**
     * Næsta lag er spilað. Kallað á þessa aðferð þegar fyrra lag á listanum endar
     */
    void naestaLag() {

    }
}