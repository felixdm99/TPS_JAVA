package catalogo_biblioteca;

public class MainBiblioteca { //al definir constructores propios, Java deja de proporcionar automáticamente el constructor vacío
    public static void main(String[] args)
    {
        Libro libro1= new Libro("Harry Potter y la piedra filosofal"
        , "J.K. Rowling", "978-3-16-148410-0", 5, 
        15000);

        Libro libro2= new Libro("Harry Potter y la cámara secreta", "J.K. Rowling", "978-3-16-148410-1");

        Libro libro3= new Libro("", "J.K. Rowling", "978-3-16-148410-2", 2, 12000);

        System.out.println("Precio de reposición del libro 2: " + libro2.getPrecioReposicion());
        System.out.println("titulo del libro 3: " + libro3.getTitulo());
        boolean precioCambiado = libro1.setPrecioReposicion(-5000);
        System.out.println("Precio de reposición del libro 1 después de intentar establecer un precio negativo: " + precioCambiado);
        libro1.setPrecioReposicion(5000);
        System.out.println("Precio de reposición del libro 1: " + libro1.getPrecioReposicion());

        libro3.prestar();
        System.out.println("Copias disponibles del libro 3 después de prestar 1 copia: " + libro3.getCopiasDisponibles());
        libro3.prestar();
        System.out.println("Copias disponibles del libro 3 después de prestar 1 copia: " + libro3.getCopiasDisponibles());
        boolean prestamoExitoso = libro3.prestar();
        if (!prestamoExitoso) {
            System.out.println("No se pudo prestar el libro 3, no hay copias disponibles.");
        }
        
        libro3.devolver();
        System.out.println("Copias disponibles del libro 3 después de devolver 1 copia: " + libro3.getCopiasDisponibles());

        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();




    }


}