package trabajo_practico3;

   public class Camion extends Vehiculo{
        private double capacidadToneladas;
        public Camion(String patente, String marca, double costoBasekm,double capacidadToneladas){
            super(patente, marca, costoBasekm);
            this.capacidadToneladas=capacidadToneladas;
        }

       
            @Override
            public double calcularCostoViaje(double distanciakm)
            {
            return (distanciakm*costoBasekm)*(1+capacidadToneladas*0.05);
        }

    }