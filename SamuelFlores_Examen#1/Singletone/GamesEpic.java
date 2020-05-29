/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone;

/**
 *
 * @author Samuel
 */
public class GamesEpic {
    private static volatile GamesEpic instance = new GamesEpic();

    private GamesEpic() {
    }
    
    public static GamesEpic getInstance(){
        return instance;
    }
    
    public String getGame(){
        return "GTAV running!";
    }
    
}
