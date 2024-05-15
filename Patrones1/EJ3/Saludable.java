package Patrones1.EJ3;

public class Saludable implements Estado {
    private Personaje personaje ;
    @Override
    public void caminar() {
        System.out.println("YENDO AL OBJETIVO");
    }

    @Override
    public void correr() {
        System.out.println("CORRO A 5M/M");
    }

    @Override
    public void beber() {
        System.out.println("GANANDO RESISTENCIA.");
    }

    @Override
    public void golpear() {
        System.out.println("MI GOLPE VALE 15 PUNTOS.");
    }
}
