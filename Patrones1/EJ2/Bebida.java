package Patrones1.EJ2;

public abstract class Bebida {


    public final void prepararBebida() {
        hervirAgua();
        agregarSaco();
        diluir();
        servirEnTaza();
        agregarCondimentos();
    }
    void hervirAgua() {
        System.out.println("Hervir el agua");
    }

    void servirEnTaza() {
        System.out.println("Servir en una taza");
    }

    abstract void agregarSaco();
    abstract void diluir();
    abstract void agregarCondimentos();
}
