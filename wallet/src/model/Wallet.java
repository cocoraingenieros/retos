package model;

import jdk.tools.jaotc.collect.ClassSearch;

public class Wallet {
    public static final int CAPACIDAD_MAXIMA = 1000000;  // la directiva static es por que su valor no cambia y final define un valor iniciando
    private int saldo;
    private boolean tieneLimite;
    private int meta;

    public Wallet() {                                     //    constructor, aqui se inicializan los valores
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
    }
    
    public int getSaldo(){
        return saldo;
    }

    public boolean getTieneLimite(){
        return tieneLimite;
    }

    public boolean establecerMeta(int value){
        if(value == 0){
            meta = value;
            return true;
        }
        if(value < 0 || value <= saldo || value > CAPACIDAD_MAXIMA && tieneLimite){
            return false;
        }
        meta = value;
        return true;
    }

    public boolean verificarMeta(){
        if(meta == 0 || meta > saldo){
            return false;
        }
        return true;
    }

    public void setTieneLimite(boolean newTieneLimite){    // void indica que no retorna ningun valor
        this.tieneLimite = newTieneLimite;
    }

    public String saveMoney(int value){
        if(saldo + value > CAPACIDAD_MAXIMA && tieneLimite){
            return "No se puede superar el limite " + CAPACIDAD_MAXIMA;
        }
        saldo += value;                                    // saldo = saldo + value
        if(verificarMeta()){System.out.println(("Has cumplido la meta!"));}
        return "Transaccion exitosa, su nuevo saldo es " + saldo;
    }

    public String takeMoney(int value){
        if(saldo <= value){
            return "Saldo insuficiente";
        }
        saldo -= value;
        return "Transaccion exitosa, su nuevo saldo es " + saldo;
    }

    public String breakLimit(){
        if(saldo >= 10000){
            saldo -= 10000;
            tieneLimite = false;
            return "Ya no tiene limite";
        }
        return "No tiene saldo suficiente :(";
    }

    public String compararCuenta(Wallet otraWallet){
        if(saldo == otraWallet.getSaldo()){
            return "Las cuentas tienen el mismo saldo";
        }
        if(saldo > otraWallet.getSaldo()){
            return "La primera cuenta es mayor";
        }
        return "La segunda cuenta es mayor";
    }
 

}
