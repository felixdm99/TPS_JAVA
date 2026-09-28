package catalogo_biblioteca;

public class Libro {
    private final String titulo;
    private final String autor; 
    private final String isbn;    
    private int copiasDisponibles;
    private double precioReposicion;


    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("El título no puede estar vacío. Se asignará 'Sin título' por defecto.");
            titulo="Sin título";
        }
        this.titulo = titulo;
        if (autor == null || autor.isBlank()) {
            System.out.println("El autor no puede estar vacío. Se asignará 'Autor desconocido' por defecto.");
            autor="Autor desconocido";
        }
        this.autor = autor;
        
        if (isbn == null || isbn.isBlank()) {
            System.out.println("El ISBN no puede estar vacío. Se asignará 'ISBN desconocido' por defecto.");
            isbn="ISBN desconocido";
        }
        this.isbn = isbn;

        if (copiasDisponibles < 0) {
            System.out.println("El número de copias disponibles no puede ser negativo. Se asignará 0 copia por defecto.");
            copiasDisponibles = 0;
        }
        this.copiasDisponibles = copiasDisponibles;


        boolean precioValido = setPrecioReposicion(precioReposicion);
        if (!precioValido) {
            this.precioReposicion = 15000;
            System.out.println("Se asignará un precio de reposición por defecto de 15000.");
        }
        
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000);
    }

        public String getTitulo() {
        return titulo;
        }

        public String getAutor() {
        return autor;
        }

        public String getIsbn() {
        return isbn;
        }

        
        
        
        
        public boolean setPrecioReposicion(double precio) {
        if (precio <= 0) {
            System.out.println("El precio debe ser mayor a 0. el precio seguira siendo el mismo.");
            return false;
        }
        else {
            this.precioReposicion = precio;
            return true;
        }}

        
        
        
        
        
        public double getPrecioReposicion() {
        return precioReposicion;
        }
        public int getCopiasDisponibles() {
        return copiasDisponibles;
        }
     
    public boolean prestar() {
        if (copiasDisponibles > 0){
            copiasDisponibles--;
            System.out.println("Se ha prestado el libro: " + titulo + ". Copias disponibles: " + copiasDisponibles);
            return true;
        } else {
            System.out.println("No hay copias disponibles para prestar.");
            return false;
        }
     }
    public void devolver() {
        
        copiasDisponibles++;
        System.out.println("Se ha devuelto el libro: " + titulo + ". Copias disponibles: " + copiasDisponibles);
     }
    public void mostrarFicha() {
        
        System.out.println("Ficha del libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Copias disponibles: " + copiasDisponibles);
        System.out.println("Precio de reposición: " + precioReposicion);
     }

}
