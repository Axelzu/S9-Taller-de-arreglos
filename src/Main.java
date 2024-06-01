import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        System.out.println("puestos libres: "+parqueadero.calcularPuestosLibres());
        parqueadero.entrarCarro("PBP-001");
        parqueadero.entrarCarro("PPP-002");
        System.out.println("puestos libres: "+parqueadero.calcularPuestosLibres());
        System.out.println("promedio hora: "+parqueadero.darTiempoPromedio());
        System.out.println("carro: "+parqueadero.DevuelveCarroMayorTiempo().darPlaca());
        System.out.println("Existe auto mas de 8 horas: "+parqueadero.hayCarroMasDeOchoHoras());
        System.out.println("Carros parqueados por más de tres horas:");
        ArrayList<Carro> carrosMasDeTresHoras = parqueadero.darCarrosMasDeTresHorasParqueados();
        if (!carrosMasDeTresHoras.isEmpty()) {
            System.out.println("Carros parqueados más de tres horas:");
            for (Carro carro : carrosMasDeTresHoras) {
                System.out.println(carro.darPlaca());
            }
        } else {
            System.out.println("No hay carros parqueados más de tres horas.");
        }
        System.out.println("Hay carros con placa igual: " + parqueadero.hayCarrosPlacaIgual());
        System.out.println("Cantidad de carros con placa PB: " + parqueadero.contarCarrosQueComienzanConPlacaPB());
        System.out.println("Hay carro parqueado por 24 o más horas: " + parqueadero.hayCarroCon24Horas());
        System.out.println(parqueadero.metodo1());
        System.out.println("Cantidad de carros sacados: " + parqueadero.desocuparParqueadero());
        System.out.println(parqueadero.metodo2());
    }
}
