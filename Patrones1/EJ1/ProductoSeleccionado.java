package Patrones1.EJ1;

public class ProductoSeleccionado implements Estado{

    private Maquina maquina;

    private   Producto producto;

    @Override
    public void insetarDinero(int dinero) {
        System.out.println("Ya tiene dinero, seleccione producto.");
    }

    @Override
    public void seleccionarProducto(Producto producto) {
        System.out.println("El producto seleccionado es: " + producto);
    }

    @Override
    public void devolverDinero() {
        this.maquina.setDinero(this.maquina.getDinero() - producto.getPrecio());
        if ( this.maquina.getDinero() <= 0 ) {
            this.maquina.setEstado(new SinDinero());
        }
        else {
            this.maquina.setEstado(new ConDinero());
        }
    }

    public void setMaquina(Maquina maquina){
        this.maquina = maquina;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
