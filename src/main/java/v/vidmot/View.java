package v.vidmot;

public enum View {


    HEIMA("heima-view.fxml"),
    LISTI("listi-view.fxml"),
    ASKRIFANDI("askrifandi-view.fxml");

    private String fileName;

    View(String fileName){
        this.fileName = fileName;
    }


    public String getFileName(){
        return fileName;
    }
}
