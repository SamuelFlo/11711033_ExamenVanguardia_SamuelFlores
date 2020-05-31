/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Samuel
 */
public class Suscriptor implements Observer {
    private String name;
   
    public Suscriptor(){
    }
    public Suscriptor(String name) {
        this.name = name;
    }
    public void Update(Subject update){
        System.out.println(this.name+ " tienes un nuevo video que ver, CORRE!");
		System.out.println(update);
    }
}
