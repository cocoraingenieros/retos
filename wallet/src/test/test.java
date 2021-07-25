// crear un assert para comparar
package test;

import model.Client;

public class test {

    public static void main(String[] args) {
        test iniciarPruebas = new test();
        iniciarPruebas.escenarioClient();
    }

    public void escenarioClient(){
        Client cliente1 = new Client("Esteban");

        boolean test1 = assertEquals("Esteban", cliente1.getNombre());
        // (condition)? responseTrue : resmponseFalse                         operador ternario
        System.out.println((test1)? "Paso la prueba de nombre" : "Error el nombre no es igual");
    }
    public boolean assertEquals(String expected, String received){
        if(expected.equalsIgnoreCase(received)){
            return true;
        }
        return false;
    }
    

    //funcion asser Not Null
    public boolean asserNotNull(Object objeto){
        if(objeto != null){
            return true;
        }
        return false; 
    }
}
