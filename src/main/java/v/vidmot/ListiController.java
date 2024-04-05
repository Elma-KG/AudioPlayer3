package v.vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import v.vinnsla.Lag;
import v.vinnsla.Lagalistar;
import v.vinnsla.Lagalisti;

public class ListiController {
    private final String PLAY = "play.png";  /// laga þetta ekki inn á dótinu
    private final String PAUSE = "pause.png";  /// laga þetta ekki inn á dótinu


    @FXML
    protected ListView<Lag> fxListView; //lagalisti
    @FXML
    public ProgressBar progressBar;
    @FXML
    protected ImageView fxPlayPauseMynd; // mynd fyrir play/paus button
    @FXML
    protected ImageView fxMyndLags;  // mynd fyrir lag


    private Lag validLag;
    private Lagalisti lagalisti;
    private MediaPlayer mediaPlayer;



    /**
     * Frumstillir lagalistann og tengir hann við ListView viðmótshlut
     */

    public void initialize() {
        lagalisti = Lagalistar.getNuverandi();
        fxListView.setItems(lagalisti.getLagListi()); // virkar þetta??
        fxListView.getSelectionModel().select(lagalisti.getIndex());
        fxListView.requestFocus();

        veljaLag();
        setjaPlayer();
    }

    /**
     * Bregðast við músaratburði og spila valið lag
     *
     * @param mouseEvent
     */
    @FXML
    protected void onValidLag(MouseEvent mouseEvent) {
        System.out.println(fxListView.getSelectionModel().getSelectedItem());
        veljaLag();
        spilaLag();
    }

    /**
     * Lætur laga lista vita hvert valda lagið er. Uppfærir myndina fyrir lagið.
     */
    private void veljaLag() {
        validLag = fxListView.getSelectionModel().getSelectedItem();
        lagalisti.setIndex(fxListView.getSelectionModel().getSelectedItem().getLengd());
        setjaMynd(fxMyndLags, validLag.getMyndskraNafn());
    }

    /**
     * Lagið er pásað ef það er í spilun, lagið er spilað ef það er í pásu
     *
     * @param actionEvent ónotað
     */
    @FXML
    private void onPlayPause(ActionEvent actionEvent) {
        if(mediaPlayer.getStatus().equals((MediaPlayer.Status.PLAYING))){
            setjaMynd(fxPlayPauseMynd, PLAY);
            mediaPlayer.pause();
        }else if (mediaPlayer.getStatus().equals(MediaPlayer.Status.PAUSED)){
            setjaMynd(fxPlayPauseMynd, PAUSE);
            mediaPlayer.play();
        }

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
        setjaMynd(fxPlayPauseMynd, PAUSE);
        setjaPlayer();
        mediaPlayer.play();

    }

    /**
     * Setja mynd með nafni á ImageView
     *
     * @param fxImageView viðmótshluturinn sem á að uppfærast
     * @param nafnMynd    nafn á myndinni
     */
    private void setjaMynd(ImageView fxImageView, String nafnMynd) {
        System.out.println(nafnMynd);
        fxImageView.setImage(new Image(getClass().getResource(nafnMynd).toExternalForm()));

    }

    /**
     * Setja upp player fyrir lagið, þ.m.t. at setja handler á hvenær lagið stoppar
     * og tengja
     * lagið við progress bar
     */
    private void setjaPlayer() {
        if (mediaPlayer != null){
            mediaPlayer.stop();
        }
        mediaPlayer = new MediaPlayer(new Media(getClass().getResource(validLag.getHljodskraNafn()).toExternalForm()));
        mediaPlayer.setStopTime(new Duration(validLag.getLengd()));
        mediaPlayer.setOnEndOfMedia(this::naestaLag);
        mediaPlayer.currentTimeProperty().addListener((observable, oldValue, newValue) ->
                progressBar.setProgress(newValue.divide(validLag.getLengd()).toMillis()));
    }
    /**
     * Næsta lag er spilað. Kallað á þessa aðferð þegar fyrra lag á listanum endar
     */
    void naestaLag() {
        lagalisti.naesti();
        fxListView.getSelectionModel().selectIndices(lagalisti.getIndex());
        veljaLag();
        spilaLag();

    }
}