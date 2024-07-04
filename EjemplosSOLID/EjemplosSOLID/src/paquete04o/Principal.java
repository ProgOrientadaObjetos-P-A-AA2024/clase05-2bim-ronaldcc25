/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04o;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        // TransporteTransvia transvia
        TransporteTransvia t1 = new TransporteTransvia();
        t1.establecerCooperativaTransvia("Rutas Loja");
        t1.establecerTarifa();
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerCooperativaAereo("Americas");
        aereo.establecerTarifa();
        
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerCooperativaMaritima("Titanic");
        mar.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(t1);
        lista.add(aereo);
        lista.add(mar);
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
