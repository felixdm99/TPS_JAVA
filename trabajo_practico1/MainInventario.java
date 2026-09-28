package trabajo_practico1;


public class MainInventario {
    public static void main(String[] args){
        Producto producto1= new Producto();
        producto1.nombre= "camiseta";
        producto1.codigo = "12345";
        producto1.precio = 12.03;
        producto1.stock= 10;

        Producto producto2= new Producto();
        producto2.nombre= "pantalon";
        producto2.codigo = "54321";
        producto2.precio = 15.17;
        producto2.stock= 4;

        Producto producto3= new Producto();
        producto3.nombre= "zapatilla";
        producto3.codigo = "51423";
        producto3.precio = 12.03;
        producto3.stock= 3;

        producto1.mostrarFicha();
        producto1.actualizarPrecio(13.99);
        producto1.venderUnidades(3);
        producto1.reponerStock(10);

        producto3.mostrarFicha();
        producto3.actualizarPrecio(16.99);
        producto3.venderUnidades(2);
        producto3.reponerStock(0);

        producto2.mostrarFicha();
        producto2.actualizarPrecio(160.19);
        producto2.venderUnidades(1);
        producto2.reponerStock(10);

        Producto copia= producto1;

        copia.precio= 1.1;
        copia.stock= 10;
        copia.mostrarFicha();
        System.out.println("Stock de productoUno tras modificar copia: " 
                   + producto1.stock + " (mismo objeto en el Heap)");
    }
}

