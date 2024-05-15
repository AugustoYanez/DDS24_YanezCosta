package Patrones1.EJ1;

public class SinDinero implements Estado{

    private Maquina maquina;


    @Override
    public void insetarDinero(int dinero) {
        this.maquina.setDinero(dinero);
        System.out.println(dinero + "Ingresados Corrctamente.");
        this.maquina.setEstado(new ConDinero());
    }

    @Override
    public void seleccionarProducto(Producto p) {
        System.out.println("INGRESE DINERO!");
    }

    @Override
    public void devolverDinero() {
        System.out.println("INGRESE DINERO!");
    }

    public void setMaquina(Maquina maquina){
        this.maquina = maquina;
    }
}
