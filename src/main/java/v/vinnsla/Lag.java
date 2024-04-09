package v.vinnsla;

import java.net.URL;

public class Lag {
    private final String hljodskraNafn;
    private final String lagNafn;  //nafnið á laginu
    private final String myndskraNafn;  //myndin sem er sýnd af laginu

    private final int lengd;


    public Lag(String slod, String mynd, String nafn, int lengd){
        hljodskraNafn = slod;
        this.lagNafn = nafn;
        this.myndskraNafn = mynd;
        this.lengd = lengd;
    }
    @Override
    public String toString(){
        return lagNafn;
    }
    public String getHljodskraNafn(){
        return hljodskraNafn;
    }
    public String getLagNafn(){
        return lagNafn;
    }
    public String getMyndskraNafn(){
        return myndskraNafn;
    }
    public int getLengd(){
        return lengd;
    }

}
