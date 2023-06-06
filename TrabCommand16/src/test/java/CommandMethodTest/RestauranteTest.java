package CommandMethodTest;

import CommandMethod.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestauranteTest {

    Restaurante restaurante;
    Disponibilidade hora;

    @BeforeEach
    void setUp() {
        restaurante = new Restaurante();
        hora = new Disponibilidade(10, 13);
    }

    @Test
    void deveLiberarMesa() {
        Aviso liberarDisponibilidade = new AvisoMesaDisponivel(hora);
        restaurante.enviarAviso(liberarDisponibilidade);

        assertEquals("Mesa Disponível", hora.getSituacao());
    }

    @Test
    void deveOcuparMesa() {
        Aviso ocuparDisponibilidade = new AvisoMesaOcupada(hora);
        restaurante.enviarAviso(ocuparDisponibilidade);

        assertEquals("Mesa Ocupada", hora.getSituacao());
    }

    @Test
    void deveCancelarOcuparMesa() {
        Aviso liberarDisponibilidade = new AvisoMesaDisponivel(hora);
        Aviso ocuparDisponibilidade = new AvisoMesaOcupada(hora);

        restaurante.enviarAviso(liberarDisponibilidade);
        restaurante.enviarAviso(ocuparDisponibilidade);

        restaurante.cancelarUltimoAviso();

        assertEquals("Mesa Disponível", hora.getSituacao());
    }

}
