package Ejercicio3;

public class Estudiante {

    public String nombre, curso;
    public int edad;

    // 1. constructor por defecto
    public Estudiante(){
        nombre = "Devian Arrieta";
        edad = 19;
        curso = "2 semestre";
    }

    // 2. constructor que acepte solo los parametros nombre y edad
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // 3. constructor que acepte todos los parámetros y utilice this() para llamar a otro constructor.
    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }
}
