/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class YoutubeChannel implements Subject {

    ArrayList<String> videos = new ArrayList();
    ArrayList<Observer> registros = new ArrayList();

    public YoutubeChannel() {
    }

    @Override
    public void registerObserver(Observer registro) {
        registros.add(registro);

    }

    @Override
    public void removeObserver(Observer remove) {
    }

 

    public void addVideo(String agregar) {
        this.videos.add(agregar);
        notifyAllObservers();

    }

    public ArrayList<String> getVideo() {
        return videos;
    }

    @Override
    public String toString() {
        return "YoutubeChannel{"+ videos + '}';
    }

    
    


    @Override
    public void notifyAllObservers() {
        for (Observer o : registros) {
            o.Update(this);
        }
    }

}
