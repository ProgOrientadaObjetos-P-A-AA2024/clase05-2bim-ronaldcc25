/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TarjetaCredito tar = new TarjetaCredito();
        tar.establecerNombre("Visa");
        tar.establecerNum("1100011101");
        
        MayorEdad representante = new MayorEdad("José", tar);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNum());
        
    }
}
