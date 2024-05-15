package Patrones1.EJ2;

public class Cafe extends Bebida {

    @Override
    void agregarSaco() {
        System.out.println("Agregar el cafe");
    }

    @Override
    void diluir() {
        System.out.println("Diluir el cafe");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregar azucar al gusto");
    }
}
