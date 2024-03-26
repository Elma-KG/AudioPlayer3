package v.vinnsla;


//tengist PlayerController í vidmot  og heima-view.fxml

import java.util.ArrayList;
import java.util.List;

//allt static breytur og aðferðir
public class Lagalistar {
    private static final int MAX_LISTS = 2;

    private List<Lagalisti> lagaListar;

    public Lagalistar(){
        lagaListar = new ArrayList<>(MAX_LISTS);
    }

    public void addLagaLista(Lagalisti lagalisti){
        if (lagaListar.size() < MAX_LISTS){
            lagaListar.add(lagalisti);
        }else {
            System.out.println("Maximum number of lagalistar reached.");
        }
    }
}
