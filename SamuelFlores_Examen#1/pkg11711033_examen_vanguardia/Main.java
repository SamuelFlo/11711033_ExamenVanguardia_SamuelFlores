/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11711033_examen_vanguardia;

import State.ContenidoMembresia;
import State.MembresiaPLUS;
import State.MembresiaNormal;
import State.MembresiaBENEFITS;
import Adapter.CuentaClaro;
import Adapter.CostoPorLlamadas;
import Adapter.AccountAdapter;
import Builder.Carro;
import Builder.CarroBuilder;
import Builder.CarroDirector;
import Builder.VehiculoCarroBuilder;
import Observer.Suscriptor;
import Observer.YoutubeChannel;
import Factory.PanType;
import Factory.Pan;
import Factory.PanFactory;
import Singletone.GamesEpic;

/**
 *
 * @author Samuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*************************************************************************");
        System.out.println("Sinigleton");
        Singleton();
        System.out.println("*************************************************************************");
        System.out.println("Factory");
        Factory();
        System.out.println("*************************************************************************");
        System.out.println("Observer");
        Observer();
        System.out.println("*************************************************************************");
        System.out.println("Builder");
        Builder();
        System.out.println("*************************************************************************");
        System.out.println("Adapter");
        Adapter();
        System.out.println("*************************************************************************");
        System.out.println("State");
        State();
        System.out.println("*************************************************************************");
    }

    public static void Singleton() {
        GamesEpic juego = GamesEpic.getInstance();
        System.out.println(juego.getGame());

    }

    public static void Factory() {
        PanFactory factory = new PanFactory();
        Pan pan_centeno = factory.buildBolsaPan(PanType.CENTENO);
        System.out.println(pan_centeno.getPanes());
        Pan pan_maiz = factory.buildBolsaPan(PanType.MAIZ);
        System.out.println(pan_maiz.getPanes());
        Pan pan_trigo = factory.buildBolsaPan(PanType.TRIGO);
        System.out.println(pan_trigo.getPanes());
    }

    public static void Observer() {
        YoutubeChannel regis = new YoutubeChannel();
        Suscriptor name = new Suscriptor("Samuel");
        regis.registerObserver(name);
        regis.addVideo("Broma a mi novia, sale mal");
    }

    public static void Builder() {
        CarroBuilder carBuilder = new VehiculoCarroBuilder();
        CarroDirector director = new CarroDirector();
        director.makeCarro(carBuilder);
        Carro carro = carBuilder.getCarro();
        System.out.println(carro.toString());
    }

    public static void Adapter() {
        CuentaClaro sa = new CuentaClaro(0.15);
        System.out.println("Costo normal de tigo= " + sa.getCosto());

        AccountAdapter adapter = new AccountAdapter(new CostoPorLlamadas(0.15));
        System.out.println("Costo extra por Llamada de Tigo a Claro= " + adapter.getCosto());
    }

    public static void State() {
        ContenidoMembresia context = new ContenidoMembresia();
        System.out.println("------------Membresia PLUS------------");
        context.setEstado(new MembresiaPLUS());
        context.gameAction();
        System.out.println("");
        System.out.println("------------Membresia BENEFITS------------");

        context.setEstado(new MembresiaBENEFITS());
        context.gameAction();
        System.out.println("");
        System.out.println("------------Membresia Normal------------");
        context.setEstado(new MembresiaNormal());
        context.gameAction();

    }

}
