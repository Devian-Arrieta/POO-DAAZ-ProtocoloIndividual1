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
            "AL FINALIZAR SE MOSTRARÁ TODA LA INFORMACIÓN SUMINISTRADA \n \n"
    );

    // 1 pidiendo la información del libro
    System.out.println("1) Ingresa la información del libro");

    System.out.print("Titulo del libro: ");
        libro.titulo = teclado.nextLine();

    System.out.print("Autor del libro: ");
        libro.autor = teclado.nextLine();

    System.out.print("Número de paginas del libro: ");
        libro.numeroPaginas = teclado.nextInt();
        teclado.nextLine(); // salto de linea para limpiar el buffer

    System.out.println("\n"); // salto de linea ----------------------------------------------------------

    // 2 pidiendo la información de la cuenta bancaria
    System.out.println("2) Ingresa la información de la cuenta bancaria");

    System.out.print("Número de la cuenta: ");
        cuenta.numeroCuenta = teclado.nextLine();

    System.out.print("Saldo de la cuenta: ");
        cuenta.saldo = teclado.nextFloat();
        teclado.nextLine(); // salto de linea para limpiar el buffer

    System.out.print("Tipo de cuenta: ");
        cuenta.tipoCuenta = teclado.nextLine();

    System.out.println("\n"); // salto de linea ----------------------------------------------------------

    // 3 pidiendo la información del estudiante
    System.out.println("3) Ingresa la información del estudiante");

    System.out.print("Nombre del estudiante: ");
        estudiante.nombre = teclado.nextLine();

    System.out.print("Edad del estudiante: ");
        estudiante.edad = teclado.nextInt();
        teclado.nextLine(); // salto de linea para limpiar el buffer

    System.out.print("Curso del estudiante: ");
        estudiante.curso = teclado.nextLine();

}
