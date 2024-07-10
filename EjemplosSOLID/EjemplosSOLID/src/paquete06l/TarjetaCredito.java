package paquete06l;

public class TarjetaCredito {
    
    private String nombre;
    private String num;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNum(String n) {
        num = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNum() {
        return num;
    }
    
}
