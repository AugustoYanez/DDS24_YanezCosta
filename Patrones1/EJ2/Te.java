package Patrones1.EJ2;

public class Te extends Bebida {

    @Override
    void agregarSaco() {
        System.out.println("Seleccionar un saco de te");
    }

    @Override
    void diluir() {
        System.out.println("Verter el agua en la taza con el saco de te");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregar edulcorante o miel al gusto");
    }
}