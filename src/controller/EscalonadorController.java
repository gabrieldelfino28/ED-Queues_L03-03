package controller;

import model.Processo;
import model.Queue;

public class EscalonadorController {
    public EscalonadorController() {
        super();
    }

    public void QueueController(Queue<Processo> fila) throws Exception {
        do {
            Processo aux = fila.remove();
            if (aux.QtdRetornos > 1) {
                System.out.println("Em execução: " + aux);
                aux.QtdRetornos -= 1;
                fila.insert(aux);
            } else {
                System.err.println("Finalizado: " + aux);
            }
        } while (fila != null);
    }

}
