package CommandMethod;

public class AvisoMesaOcupada implements Aviso {

    private Disponibilidade hora;

    public  AvisoMesaOcupada(Disponibilidade hora) {
        this.hora = hora;
    }

    public void enviar() {
        this.hora.ocuparMesa();
    }

    public void cancelar() {
        this.hora.liberarMesa();
    }
}