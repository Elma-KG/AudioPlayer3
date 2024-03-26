package v.vinnsla;

import java.net.URL;

public class Lag {
    private final String hljodskraNafn;
    private final String lagNafn;  //nafnið á laginu
    private final String myndskraNafn;  //myndin sem er sýnd af laginu

    private final String url;

    public Lag(String hljodskraNafn, String lagNafn, String myndskraNafn, String url){
        this.hljodskraNafn = hljodskraNafn;
        this.lagNafn = lagNafn;
        this.myndskraNafn = myndskraNafn;
        this.url = url;

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

    public String getUrl() {
        return url;
    }
}
