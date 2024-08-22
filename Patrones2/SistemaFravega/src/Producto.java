public class Producto {
    private int precioBase;
    private  String nombre;
    private  TipoProducto tipoProducto;

    public Producto(){

    }
    public Producto(int precioBase, String nombre, TipoProducto tipoProducto) {
        this.precioBase = precioBase;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double calcularPrecioFinal(){
        return 0.0;
    }
}
