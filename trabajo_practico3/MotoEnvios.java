package trabajo_practico3;

    public class MotoEnvios extends Vehiculo{
        public MotoEnvios(String patente,String marca, double costoBasekm){
        super(patente,marca,costoBasekm);
    }
    @Override
    public double calcularCostoViaje(double distanciakm){
    return (distanciakm*costoBasekm)*0.85;
    }}