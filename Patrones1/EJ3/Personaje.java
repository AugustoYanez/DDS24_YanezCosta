package Patrones1.EJ3;

public class Personaje  {

    private Estado estado;

    private int vecesCaminar;
    private int vecesCorrer;
    private int vecesBebido;
    private int vecesGolpeado;


    public Personaje(){
        setEstado(new Herido());
    }
    public int getVecesCaminar() {
        return vecesCaminar;
    }

    public void setVecesCaminar(int vecesCaminar) {
        this.vecesCaminar = vecesCaminar;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getVecesCorrer() {
        return vecesCorrer;
    }

    public void setVecesCorrer(int vecesCorrer) {
        this.vecesCorrer = vecesCorrer;
    }

    public int getVecesBebido() {
        return vecesBebido;
    }

    public void setVecesBebido(int vecesBebido) {
        this.vecesBebido = vecesBebido;
    }

    public int getVecesGolpeado() {
        return vecesGolpeado;
    }

    public void setVecesGolpeado(int vecesGolpeado) {
        this.vecesGolpeado = vecesGolpeado;
    }
}
