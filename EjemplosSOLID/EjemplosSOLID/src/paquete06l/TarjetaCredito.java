package paquete06l;

public class TarjetaCredito {
    
    private String nombre;
    private String num;
    private Banco banco;
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNum(String n) {
        num = n;
    }
    
    public void establecerBanco(Banco b) {
        banco = b;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNum() {
        return num;
    }
    
    public Banco obtenerBanco(){
        return banco;
    }
    
}
