package Ejercicio1;

public class Libro {

    String titulo, autor;
    int numeroPaginas;

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
}
