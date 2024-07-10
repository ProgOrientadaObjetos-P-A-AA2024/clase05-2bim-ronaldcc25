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

        Banco b1 = new Banco();
        b1.establecerNombre("Pichincha");
        
        TarjetaCredito tar = new TarjetaCredito();
        tar.establecerNombre("Visa");
        tar.establecerNum("1100011101");
        tar.establecerBanco(b1);        

        MayorEdad representante = new MayorEdad("José", tar);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s\n"
                + "Tarjeta:%s\n"
                + "Nombre Banco: %s\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNum(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco().obtenerNombre());

    }
}
