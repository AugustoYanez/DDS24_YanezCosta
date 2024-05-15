package Patrones1.EJ3;

public class Envenenado  implements Estado{
     private Personaje personaje ;

    public void caminar() {
        System.out.println("NO PUEDO CAMINAR, SOLO CORRO.");
    }

    @Override
    public void correr() {
        System.out.println("CORRO EN BUSQUEDA DE SANOS  .");
    }

    @Override
    public void beber() {
        System.out.println("NO NECESITO BEBER MAS.");
    }

    @Override
    public void golpear() {
        System.out.println("MI GOLPE VALE 15 PUNTOS.");
    }
}
