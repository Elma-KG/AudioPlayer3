package v.vidmot;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ViewSwitcher {

    private static final Map<View, Parent> cache = new HashMap<>();

    private static final Map<View, Object> controllers = new HashMap<>();
    private static Scene scene;

    public static void setScene(Scene scene){
        ViewSwitcher.scene = scene;
    }

    public static void switchTo(View view, boolean b){
        if(scene == null){
            System.out.println("ekkert fannst");
            return;
        }
        try {
            Parent root;
            if (cache.containsKey(view) && b) {
                System.out.println("Loading from cache");
                root = cache.get(view);
            } else {
                System.out.println("Loading from FXML "+view.getFileName());
                FXMLLoader loader = new FXMLLoader(ViewSwitcher.class.getResource(view.getFileName()));
                root = loader.load();

                cache.put(view, root);
                //   scene.setRoot(root);
                controllers.put(view, loader.getController());
            }
            scene.setRoot(root);
            }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
