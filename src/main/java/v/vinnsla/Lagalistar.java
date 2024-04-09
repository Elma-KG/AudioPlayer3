package v.vinnsla;


//tengist PlayerController í vidmot  og heima-view.fxml

import java.util.ArrayList;
import java.util.List;

//allt static breytur og aðferðir
public class Lagalistar {
    public static final String SKRA_FANNST_EKKI = "Skra fannst ekki";
    public static final String SUFFIX = ".dat";
    public static final String NAFN = "lagalisti";
    private static int index;

    private static final Lagalisti[] listar = new Lagalisti[2];

    public static void frumstilla(){
        for (int i = 0; i < listar.length; i++){
            listar[i] = new Lagalisti();
            try {
                listar[i].lesaLog(NAFN + (i+1) + SUFFIX);
                System.out.println(listar[i]);
            }catch (Exception e){
                System.out.println(SKRA_FANNST_EKKI);
                throw new RuntimeException(e);
            }
        }
    }

    public static Lagalisti getNuverandi(){
        return listar[index];
    }

    public static void setIndex(int index){
        Lagalistar.index = index;
    }
}
