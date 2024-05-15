package Patrones1.EJ1;

import java.util.HashSet;

public class Maquina {

    private Estado estado;

    private int dinero;

    private HashSet<Producto> productos;

    public Maquina(){
        setEstado(new SinDinero());
    }

    public void setEstado(Estado estado){
        this.estado = estado;
        this.estado.setMaquina(this);
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public HashSet<Producto> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<Producto> productos) {
        this.productos = productos;
    }

    public void insertarDinero(int  dinero){
        this.estado.insetarDinero(dinero);
    }
    public void seleccionarProducto(Producto producto){
        this.estado.seleccionarProducto(producto);
    }
    public void devolverDinero(){
        this.estado.devolverDinero();
    }
}
