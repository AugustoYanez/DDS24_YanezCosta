package Patrones1.EJ1;

public class ConDinero implements Estado{

    private Maquina maquina;

    @Override
    public void insetarDinero(int dinero) {
        System.out.println("Ya tiene dinero, seleccione producto.");
    }

    @Override
    public void seleccionarProducto(Producto producto) {
        for (Producto p : maquina.getProductos()) {
            if (p.getNombre().equals(producto.getNombre())) {
                System.out.println("PRODUCTO SELECCIONADO");
                maquina.setEstado(new ProductoSeleccionado());
            }
            else {
                System.out.println("NO EXISTE PRODUCTO SELECCIONADO");
            }


        }
    }

    @Override
    public void devolverDinero() {
        System.out.println("SELECCIONE UN PRODUCTO");
    }

    public void setMaquina(Maquina maquina){
        this.maquina = maquina;
    }
}
