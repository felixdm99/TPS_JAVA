package trabajo_practico3;

public class Vehiculo {
    protected String patente;
    protected String marca;
    protected double costoBasekm;

    public Vehiculo(String patente, String marca, double costoBasekm){
        this.patente=patente;
        this.marca=marca;
        this.costoBasekm=costoBasekm;
    }

    public double calcularCostoViaje(double distanciakm){
        return distanciakm*costoBasekm;

    }
    public double calcularCostoViaje(double distanciakm, double peaje){
        return (distanciakm*costoBasekm)+peaje;

    }
       public void mostrarFicha() {
    System.out.println("Patente: " + patente);
    System.out.println("Marca: " + marca);
    System.out.println("Costo base por km: $" + costoBasekm);
    }
}







