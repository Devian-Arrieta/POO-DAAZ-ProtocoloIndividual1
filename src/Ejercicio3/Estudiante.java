package Ejercicio3;

public class Estudiante {

    String nombre, curso;
    int edad;

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
}
