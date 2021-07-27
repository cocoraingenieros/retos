
public class Presupuesto {                           // definicion de la clase

    private int pTiempo;                            // definicion atributos
    private double pMonto;
    private double pInteres;
   

                                // crear metodos(funciones) para las formulas


    //𝑖𝑛𝑡𝑒𝑟𝑒𝑠𝑆𝑖𝑚𝑝𝑙𝑒= ( 𝑚𝑜𝑛𝑡𝑜 ) ∗ ( 𝑖𝑛𝑡𝑒𝑟𝑒𝑠 ) ∗ 𝑡𝑖𝑒𝑚𝑝𝑜                  Ecuación 1-  
    public float interesSimple(int tiempo, double monto, double interes){
        return

    }
   // 𝑖𝑛𝑡𝑒𝑟𝑒𝑠𝐶𝑜𝑚𝑝𝑢𝑒𝑠𝑡𝑜 = ( 𝑚𝑜𝑛𝑡𝑜 ) ∗ [ (1+( 𝑖𝑛𝑡𝑒𝑟𝑒𝑠 ))𝑡𝑖𝑒𝑚𝑝𝑜 −1 ]     Ecuación 2 -  
   public float interesCompuesto(){
        return
   }     
   //𝑐𝑜𝑚𝑝𝑎𝑟𝑎𝑟𝑃𝑟𝑒𝑠𝑢𝑝𝑢𝑒𝑠𝑡𝑜𝑠 = 𝑖𝑛𝑡𝑒𝑟𝑒𝑠𝐶𝑜𝑚𝑝𝑢𝑒𝑠𝑡𝑜 − i𝑛𝑡𝑒𝑟𝑒𝑠𝑆𝑖𝑚𝑝𝑙𝑒           Ecuación 3 – 
   public float comparaPresupuestos(){
        return
   }
    //metodo comparar proyectos 
    public String compararProyectos(){  
        if
        return "La  diferencia  en  el  total  de  intereses  generados  para  el  proyecto,  si  escogemos  entre evaluarlo a una 
        tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: " + compararInversion + "."                

   }                                 
}


/**Se  le  ha  contratado  a  usted  como  director  para  que  evalué  la  rentabilidad  de  un  nuevo proyecto. Se 
 * desea determinar los presupuestos para los diferentes equipos de cómputo que se van a adquirir. Para esto debe 
 * determinar cuál es la diferencia monetaria en pesos para el proyecto, si se escoge entre una tasa de interés 
 * compuesta y una tasa de interés simple. Las ecuaciones para determinar el total de intereses del proyecto son 
 * las siguientes:  
                      𝑖𝑛𝑡𝑒𝑟𝑒𝑠𝑆𝑖𝑚𝑝𝑙𝑒= ( 𝑚𝑜𝑛𝑡𝑜 ) ∗ ( 𝑖𝑛𝑡𝑒𝑟𝑒𝑠 ) ∗ 𝑡𝑖𝑒𝑚𝑝𝑜 
                         Ecuación 1- Calculo del interes simple 
------------------------------------------------------------------------------------------------------
                    𝑖𝑛𝑡𝑒𝑟𝑒𝑠𝐶𝑜𝑚𝑝𝑢𝑒𝑠𝑡𝑜 = ( 𝑚𝑜𝑛𝑡𝑜 ) ∗ [ (1+( 𝑖𝑛𝑡𝑒𝑟𝑒𝑠 ))𝑡𝑖𝑒𝑚𝑝𝑜 −1 ] 
                                Ecuación 2 - Calculo del interés compuesto                                
------------------------------------------------------------------------------------------------------
                        𝑐𝑜𝑚𝑝𝑎𝑟𝑎𝑟𝑃𝑟𝑒𝑠𝑢𝑝𝑢𝑒𝑠𝑡𝑜𝑠 = 𝑖𝑛𝑡𝑒𝑟𝑒𝑠𝐶𝑜𝑚𝑝𝑢𝑒𝑠𝑡𝑜 − i𝑛𝑡𝑒𝑟𝑒𝑠𝑆𝑖𝑚𝑝𝑙𝑒
    Ecuación 3 – Diferencia de comparar los intereses totales según los tipos de interés 
------------------------------------------------------------------------------------------------------
Como requerimiento se le solicita que cree una clase llamada Presupuesto, la cual tenga entre sus métodos uno llamado 
compararProyectos() el cual reciba como parámetros las tres entradas: 
( int pTiempo, double pMonto, double pInteres ). Haciendo uso de métodos para calcular el total de intereses simples y 
compuestos, determine la diferencia resultante de comparar las inversiones según el tipo de tasa de interés. Y retorne 
una cadena de texto de la forma: 
   
"La  diferencia  en  el  total  de  intereses  generados  para  el  proyecto,  si  escogemos  entre evaluarlo a una 
tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $ {compararInversion}."  
 O bien. 
 
"Faltan  datos  para  calcular  la  diferencia  en  el  total  de  intereses  generados  para  el proyecto." 
  
 Ejemplo: ------------------------------------------------------------------------------------------------------
Entradas:  
Nombre                  Tipo                Descripción  
pMonto                 double               Valor del equipo 
pInteres               double               Interés relacionado al valor 
pTiempo                  int                Tiempo de duración  
 
Salida:  
Nombre                  Tipo                 Descripción  
compararProyectos      String                 “Resultado ” {respuesta} 
  */