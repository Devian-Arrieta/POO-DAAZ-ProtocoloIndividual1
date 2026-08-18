package Ejercicio1;

public class Libro {

    public String titulo, autor;
    public int numeroPaginas;

    // 1. constructor por defecto
    public Libro(){
        titulo = "Las Crónicas de Narnia: el león, la bruja y el ropero";
        autor = "Clive Staples Lewis";
        numeroPaginas = 200;
    }

    // 2. constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // 3. Metodo para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println(
                "Titulo: "+ this.titulo + "\n"+
                "Autor: "+ this.autor + "\n"+
                "Número de páginas: "+ this.numeroPaginas
        );
    }

    @Override
    public String toString(){
        return "Titulo: "+ this.titulo + "\n" +
                "Autor: "+ this.autor + "\n" +
                "Número de páginas: "+ this.numeroPaginas;
    }
}
