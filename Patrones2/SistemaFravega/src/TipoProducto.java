import java.util.List;

public class TipoProducto {

    private String nombre;
    private List<Impuesto> impuestos;

    public TipoProducto(String nombre, List<Impuesto> impuestos) {
        this.nombre = nombre;
        this.impuestos = impuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Impuesto> getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(List<Impuesto> impuestos) {
        this.impuestos = impuestos;
    }

    public double impuestosTotales(int precio){
        return 0.1;
    }

    public void addImpuesto(){

    }

}
