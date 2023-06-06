package CommandMethod;

import java.util.ArrayList;
import java.util.List;

    public class Restaurante {

        private List<Aviso> avisos = new ArrayList<Aviso>();

        public void enviarAviso(Aviso aviso) {
            this.avisos.add(aviso);
           aviso.enviar();
        }

        public void cancelarUltimoAviso() {
            if (avisos.size() != 0) {
               Aviso aviso = this.avisos.get(this.avisos.size() - 1);
                aviso.cancelar();
                this.avisos.remove(this.avisos.size() - 1);
            }
        }

    }
