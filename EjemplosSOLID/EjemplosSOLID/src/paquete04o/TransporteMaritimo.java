package paquete04o;

public class TransporteMaritimo extends Transporte{

    private String cooperativaMaritima;

    public void establecerCooperativaMaritima(String n) {
        cooperativaMaritima = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 20.00 + 0.80;
    }

    public String obtenerCooperativaMaritima() {
        return cooperativaMaritima;
    }

}
