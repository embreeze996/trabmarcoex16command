package CommandMethod;

public class AvisoMesaDisponivel implements Aviso {

    private Disponibilidade hora;

    public AvisoMesaDisponivel(Disponibilidade hora) {
        this.hora = hora;
    }

    public void enviar() {
        this.hora.liberarMesa();
    }

    public void cancelar() {
        this.hora.ocuparMesa();
    }
}