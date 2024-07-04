package paquete04o;

public class TransporteTransvia extends Transporte {

    private String cooperativaTransvia;

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 20 + 0.1;
    }

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }
}
