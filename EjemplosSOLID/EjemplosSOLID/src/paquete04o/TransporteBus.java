package paquete04o;

public class TransporteBus extends Transporte {

    private String cooperativaBus;

    public void establecerCooperativaBus(String n) {
        cooperativaBus = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaBus() {
        return cooperativaBus;
    }

}
