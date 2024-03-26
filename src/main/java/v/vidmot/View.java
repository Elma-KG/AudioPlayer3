package v.vidmot;

public enum View {


    ASKRIFANDI("askrifandi-view.fxml"),
    HEIMA("heima-view.fxml"),
    LISTI("listi-view.fxml");

    private String fileName;

    View(String fileName){
        this.fileName = fileName;
    }


    public String getFileName(){
        return fileName;
    }
}
