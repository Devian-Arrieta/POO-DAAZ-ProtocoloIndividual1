import Ejercicio1.Libro;
import Ejercicio2.CuentaBancaria;
import Ejercicio3.Estudiante;

void main() {

    // Instanciamos e importamos el scanner
    Scanner teclado = new Scanner(System.in);

    // Instanciamos las clases con los constructores
    Libro libro = new Libro();
    CuentaBancaria cuenta = new CuentaBancaria();
    Estudiante estudiante = new Estudiante();

    // Mensajes para pedir por consola la información

    System.out.println(
            "BIENVENID@ \n" +
            "A CONTINUACIÓN VAS A INGRESAR LA INFORMACIÓN CORRESPONDIENTE EN ORDEN\n" +
            "1. LIBRO \n" +
            "2. CUENTA BANCARIA \n" +
            "3. ESTUDIANTE \n" +
            "AL FINALIZAR SE MOSTRARÁ TODA LA INFORMACIÓN SUMINISTRADA \n"
    );

    // 1 pidiendo la información del libro
    System.out.println("1) Ingresa la información del libro");

    System.out.print("Titulo del libro: ");
        libro.titulo = teclado.nextLine();

    System.out.print("Autor del libro: ");
        libro.autor = teclado.nextLine();

    System.out.print("Número de paginas del libro: ");
        libro.numeroPaginas = teclado.nextInt();

    libro.mostrarDetalles();
}
