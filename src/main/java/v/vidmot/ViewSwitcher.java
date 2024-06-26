package v.vidmot;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ViewSwitcher {

    private static final Map<View, Parent> cache = new HashMap<>();

    private static final Map<View, Object> controllers = new HashMap<>();
    private static Scene scene;

    public static void setScene(Scene scene) {
        ViewSwitcher.scene = scene;
    }

    /**
     * Skiptir um view og og tekurinn boolean fyrir cache sem greinir hvort eigi að geyma upplýsingar
     * @param view
     * @param isCache
     */

    public static void switchTo(View view, boolean isCache) {

        if (scene == null) {
            System.out.println("No scene was set");
            return;
        }

        try {
            Parent root;

            if (cache.containsKey(view) && isCache) {
                System.out.println("Loading from cache");
                root = cache.get(view);
            } else {
                System.out.println("Loading from FXML " + view.getFileName());
                FXMLLoader loader = new FXMLLoader(ViewSwitcher.class.getResource(view.getFileName()));
                root = loader.load();

                cache.put(view, root);
                //   scene.setRoot(root);
                //controllers.put(view, loader.getController());
                PlayerController playerController = (PlayerController) controllers.get(view);

            }
            scene.setRoot(root);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
