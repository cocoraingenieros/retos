package model;

public class Client extends User{                // extends es para heredar
    private Wallet wallet;   

    public Client(String newNombre) {               // el constructor se generas con   ctor
        super();
        wallet = new Wallet();
        setNombre(newNombre);
    }

    public Wallet getWallet() {
        return wallet;
    }

    
    
}
