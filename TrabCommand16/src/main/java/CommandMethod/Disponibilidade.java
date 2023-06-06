package CommandMethod;

public class Disponibilidade {

    private int dia;
    private int hora;
    private String situacao;

    public Disponibilidade(int dia, int hora ) {
        this.dia = dia;
        this.hora = hora;
    }

    public String getSituacao() {
        return situacao;
    }

    public void liberarMesa() {
        this.situacao = "Mesa Disponível";
    }

    public void ocuparMesa() {
        this.situacao = "Mesa Ocupada";
    }
}