package v.vidmot;

import java.util.ArrayList;
import java.util.List;

public class ObservableAskrifandi implements AskrifandiObserver {
    private String nafn;
    private List<AskrifandiObserver> observers = new ArrayList<>();

    public ObservableAskrifandi(String nafn){
        this.nafn = nafn;
    }

    public String getNafn(){
        return nafn;
    }
    public void setNafn(String nafn){
        this.nafn =nafn;
        notifyObservers();
    }

    public void addObserver(AskrifandiObserver observer){
        observers.add(observer);
    }
    public void removeObserver(AskrifandiObserver observer){
        observers.remove(observer);
    }

    /**
     * Lætur Observer vita og uppfærir
     */

    private void notifyObservers() {
        for (AskrifandiObserver observer : observers) {
            observer.updateAsrkifandi(this);
        }
    }

    /**
     * uppfærir áskrifanda
     * @param askrifandi
     */
    @Override
    public void updateAsrkifandi(ObservableAskrifandi askrifandi) {
        nafn = askrifandi.getNafn();
    }
}
