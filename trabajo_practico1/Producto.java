package trabajo_practico1;

public class Producto{
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    public void venderUnidades(int cantidad){

        if (cantidad > 0 && cantidad <= stock){
            stock = stock - cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre + ". Stock restante: " + stock);
        }
        else if (cantidad <= 0) {
            System.out.println("no se pueden ingresar valor negativos o iguales a 0!");
            
        }
        else{
            System.out.println("error superaste la cantidad de stock!");
        }

    }
    public void reponerStock(int cantidad){
        if(cantidad > 0){
            stock = stock + cantidad;
            System.out.println("Reposición registrada: +" + cantidad + " unidades. Stock actual: " + stock);
        }
        else{
            System.out.println("no pueden sumarse numeros negativos!");
        }

    }
    public void actualizarPrecio(double precio){
        double precioAnterior = this.precio;
        this.precio=precio;
        System.out.println("El precio anterior de " + nombre + " es " + precioAnterior + ". El nuevo precio es " + precio);
    }
    public void mostrarFicha( ){
        System.out.println("=== Ficha de producto ===");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre );
        System.out.println("Precio: " + precio);
        System.out.println("stock: " + stock);
        System.out.println("=========================");
    }}