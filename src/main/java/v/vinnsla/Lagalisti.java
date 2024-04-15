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



    public void lesaLog(String nafnASkra) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/v/vinnsla/" + nafnASkra);
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);

        String[] line;
        try {
            while (scanner.hasNextLine()){
                line = scanner.nextLine().split(" ");
                lagListi.add(new Lag (line[0], line[3], line[1], Integer.parseInt(line[2])));
            }
            scanner.close();
        }catch (RuntimeException e){
            e.printStackTrace();
        }




        }

    public void naesti(){
        currentIndex = ++currentIndex % lagListi.size();
    }

    public ObservableList<Lag> getLagListi(){
        return lagListi;
    }
    public void setIndex(int index){
        currentIndex = index;
    }
    public int getIndex(){
        return currentIndex;
    }
}




