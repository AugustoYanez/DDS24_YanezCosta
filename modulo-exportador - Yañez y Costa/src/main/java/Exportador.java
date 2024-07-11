import java.util.List;
import java.util.Map;

public class Exportador {
    private Documento documento;
    private EstrategiaDeExportacion estrategia;

    public Exportador(Documento documento) {
        this.documento = documento;
    }

    public void setEstrategia(EstrategiaDeExportacion estrategia) {
        this.estrategia = estrategia;
    }

    public String exportar(String formato) {

        switch (formato) {
             case "excel":
                setEstrategia( new ExportarAExcel(documento.getNombre()));
                break;
             case "pdf":
                    setEstrategia(new ExportarPDF(documento.getNombre()));
                    break;
        }

        return estrategia.exportar(this);
    }

    public Map<String, List<String>> datos(){
        return documento.getDatos();
    }
}
