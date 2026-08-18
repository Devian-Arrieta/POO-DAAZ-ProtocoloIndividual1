package Ejercicio2;

public class CuentaBancaria {
    public String numeroCuenta, tipoCuenta;
    public float saldo;

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

    // 3. constructor sobrecargado con 3 parametros
    public CuentaBancaria(String numeroCuenta, float saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = numeroCuenta;
    }
}
