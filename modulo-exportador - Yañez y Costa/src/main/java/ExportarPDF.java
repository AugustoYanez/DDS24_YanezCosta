
public class ExportarPDF implements EstrategiaDeExportacion{

    private AdapterApachePDFBox adapterApachePDFBox;
    private String nombre;

    public ExportarPDF( String nombre) {
        this.nombre = nombre;
    }

    public AdapterApachePDFBox getAdapterApachePDFBox() {
        return adapterApachePDFBox;
    }

    public void setAdapterApachePDFBox(AdapterApachePDFBox adapterApachePDFBox) {
        this.adapterApachePDFBox = adapterApachePDFBox;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String exportar(Exportador exportador) {
        setAdapterApachePDFBox(new AdapterApachePDFBox(nombre));
        return adapterApachePDFBox.exportar(exportador);
    }
}
