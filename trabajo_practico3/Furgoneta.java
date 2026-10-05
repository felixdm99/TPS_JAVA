package trabajo_practico3;

    public class Furgoneta extends Vehiculo{
        private boolean tieneRefrigeracion;
        public Furgoneta(String patente,String marca, double costoBasekm, boolean tieneRefrigeracion){
        super(patente,marca,costoBasekm);
        this.tieneRefrigeracion=tieneRefrigeracion;
        }
        @Override
        public double calcularCostoViaje(double distanciakm){
        if (tieneRefrigeracion == true){
            return (distanciakm*costoBasekm)+5000;
        }
        else{
            return (distanciakm*costoBasekm);
        }

    }}