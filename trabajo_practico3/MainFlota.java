package trabajo_practico3;

public class MainFlota {
    public static void main(String[] args) {
    Vehiculo[]flota = new Vehiculo[3];
    flota[0]= new Camion("AD570RW", "MAZDA", 1800.00, 10);
    flota[1]= new Furgoneta("AD560PH", "FIAT", 1500.00, true);
    flota[2]= new MotoEnvios("ABC123", "ZANELLA", 500.00);
    
    double total=0;
    for(Vehiculo v : flota){
        v.mostrarFicha();
        double costo = v.calcularCostoViaje(150.0);
        total= costo + total;
    }
    System.out.println("el total es " + total);
}}
