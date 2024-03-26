package v.vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;


//tengist ListiController í vidmot og listi-view.fxml
public class Lagalisti {
    private final ObservableList<Lag> lagListi = FXCollections.observableArrayList();
    private int currentIndex =0;

    public Lagalisti() {
        currentIndex = -1;
        lagListi.add(new Lag("sample-3s.mp3", "Va", "fox.png", "file:/C:/Users/Administrator/OneDrive - Menntaský/Documents/Viðmótsforritun/AudioPlayer3/src/main/resources/v/media/sample-3s.mp3"));
        lagListi.add(new Lag("sample-6s.mp3", "Við", "fox.png", "file:/C:/UsersAdministrator/OneDrive - Menntaský/Documents/Viðmótsforritun/AudioPlayer3/src/main/resources/v/media/sample-6s.mp3"));
    }

    public void lesaLog(String nafnASkra) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        File file = new File(System.getProperty("user.dir") + "src/main/resources/v/" + nafnASkra);
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);

        String[] line;

        while (scanner.hasNextLine()) {
            String[] gogn = scanner.nextLine().split(",");


            if (gogn.length >= 4) {
                String hljodskraNafn = gogn[0];
                String lagNafn = gogn[1];
                String myndskraNafn = gogn[2];
                String url = gogn[3];

                Lag lag = new Lag(hljodskraNafn, lagNafn, myndskraNafn, url);
                lagListi.add(lag);
            } else {
                System.out.println("rangt");
            }


        }
    }

    public ObservableList<Lag> getLagListi() {
        return lagListi;
    }
}


