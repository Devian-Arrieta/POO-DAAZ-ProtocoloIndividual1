package Ejercicio2;

public class CuentaBancaria {
    String numeroCuenta, tipoCuenta;
    float saldo;

    // 1. constructor por defecto
    public CuentaBancaria() {
        numeroCuenta = "1980-0045-3895";
        saldo = 100000;
        tipoCuenta = "cuenta de ahorros";
    }

    // 2. constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = numeroCuenta;
    }
}
