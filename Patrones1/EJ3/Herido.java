package Patrones1.EJ3;

public class Herido implements Estado{
    public void caminar() {
        System.out.println("BUSCANDO VENDAJES.");
    }

    @Override
    public void correr() {
        System.out.println("NO PUEDO CORRER.");
    }

    @Override
    public void beber() {
        System.out.println("RECUPERANDOME.");
    }

    @Override
    public void golpear() {
        System.out.println("NO TENGO SUFICIENTE ENERGIA.");
    }
}
