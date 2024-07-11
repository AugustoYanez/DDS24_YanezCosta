import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Documento {
    private  Map<String, List<String>> datos;

    private String nombre;

    public Documento(String nombre) {
        this.datos = new HashMap<>();
        this.nombre = nombre;
    }

    public Map<String, List<String>> getDatos() {
        return datos;
    }

    public void setDatos(Map<String, List<String>> datos) {
        this.datos = datos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarDato(String clave, String valor) {
        if (!datos.containsKey(clave)) {
            datos.put(clave, new ArrayList<>());
        }
        datos.get(clave).add(valor);
    }
    public String exportar(String formato) {
        return new Exportador(this).exportar(formato);
    }

}
