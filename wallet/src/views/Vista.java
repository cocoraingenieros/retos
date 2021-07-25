package views;

import model.Wallet;

public class Vista {

    public static void main2(String[] args){           // se escribe    main + enter y autocompleta la funcion
        Wallet wallet1 = new Wallet();                // crea wallet1      
        Wallet wallet2 = new Wallet();               // crea wallet2
        System.out.println(wallet1.getSaldo());      // se escribe    syso + enter y me llama la funcion imprimir
        System.out.println(wallet1.saveMoney(200000));    //agrega 200000 en wallet1 
        System.out.println(wallet1.saveMoney(300000));
        System.out.println(wallet1.breakLimit());         // rompe el limite de la wallet1
        System.out.println(wallet1.saveMoney(600000));
        System.out.println(wallet1.getSaldo());           //me muestra el saldo de wallet1
        wallet2.saveMoney(500000);                        //agrega 500000 a wallet uno pero no lo muestra
        System.out.println((wallet2.getSaldo()));         // muestra el saldo de wallet2
        System.out.println(wallet2.establecerMeta(1100000));
        System.out.println(wallet1.establecerMeta(900000));
        System.out.println(wallet1.establecerMeta(1900000));
        System.out.println(wallet1.saveMoney(1200000));


    }
    
}
