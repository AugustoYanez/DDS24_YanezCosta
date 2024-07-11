import config.Config;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOne {

    private Documento documento;

    @Before
    public void init()
    {
        Documento doc = new  Documento("DOC.pdf");
        doc.agregarDato("1","#4r");
        this.documento = doc;

    }
    @Test
    public void exportExcel(){
        Assert.assertEquals(Config.RUTA_EXPORTACION + this.documento.getNombre(), this.documento.exportar("excel"));
    }

    @Test
    public void exportPDF(){
        Assert.assertEquals(Config.RUTA_EXPORTACION + this.documento.getNombre(), this.documento.exportar("pdf"));
    }


}
