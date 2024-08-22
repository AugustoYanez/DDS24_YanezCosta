import java.util.HashSet;
import java.util.Observer;

public class Sucursal {

    private String nombre;
    private String descripcion;
    private String direccion;
    private HashSet<Producto> productos;
    private HashSet<IObserver> interesados;

    public Sucursal(String nombre, String descripcion, String direccion, HashSet<Producto> productos, HashSet<IObserver> interesados) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.productos = productos;
        this.interesados = interesados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Producto> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<Producto> productos) {
        this.productos = productos;
    }

    public HashSet<IObserver> getInteresados() {
        return interesados;
    }

    public void setInteresados(HashSet<IObserver> interesados) {
        this.interesados = interesados;
    }

    public void addProducto(){

    }
    public void editProducto(){

    }
    public void deleteProducto(){

    }
    public void registrarVenta(){

            Producto producto = new Producto();
        for ( IObserver interesado : interesados){
            interesado.serAvisadoDeVenta(producto);
        }
    }
}
