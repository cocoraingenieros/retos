
public class Presupuesto {                           // definicion de la clase

    private int pTiempo;                            // definicion atributos
    private double pMonto;
    private double pInteres;
   

                                // crear metodos(funciones) para las formulas


    //πππ‘ππππ ππππππ= ( ππππ‘π ) β ( πππ‘ππππ  ) β π‘πππππ                  EcuaciΓ³n 1-  
    public float interesSimple(int tiempo, double monto, double interes){
        return

    }
   // πππ‘ππππ πΆππππ’ππ π‘π = ( ππππ‘π ) β [ (1+( πππ‘ππππ  ))π‘πππππ β1 ]     EcuaciΓ³n 2 -  
   public float interesCompuesto(){
        return
   }     
   //ππππππππππππ π’ππ’ππ π‘ππ  = πππ‘ππππ πΆππππ’ππ π‘π β iππ‘ππππ ππππππ           EcuaciΓ³n 3 β 
   public float comparaPresupuestos(){
        return
   }
    //metodo comparar proyectos 
    public String compararProyectos(){  
        if
        return "La  diferencia  en  el  total  de  intereses  generados  para  el  proyecto,  si  escogemos  entre evaluarlo a una 
        tasa de interΓ©s Compuesto y evaluarlo a una tasa de interΓ©s Simple, asciende a la cifra de: " + compararInversion + "."                

   }                                 
}


/**Se  le  ha  contratado  a  usted  como  director  para  que  evaluΓ©  la  rentabilidad  de  un  nuevo proyecto. Se 
 * desea determinar los presupuestos para los diferentes equipos de cΓ³mputo que se van a adquirir. Para esto debe 
 * determinar cuΓ‘l es la diferencia monetaria en pesos para el proyecto, si se escoge entre una tasa de interΓ©s 
 * compuesta y una tasa de interΓ©s simple. Las ecuaciones para determinar el total de intereses del proyecto son 
 * las siguientes:  
                      πππ‘ππππ ππππππ= ( ππππ‘π ) β ( πππ‘ππππ  ) β π‘πππππ 
                         EcuaciΓ³n 1- Calculo del interes simple 
------------------------------------------------------------------------------------------------------
                    πππ‘ππππ πΆππππ’ππ π‘π = ( ππππ‘π ) β [ (1+( πππ‘ππππ  ))π‘πππππ β1 ] 
                                EcuaciΓ³n 2 - Calculo del interΓ©s compuesto                                
------------------------------------------------------------------------------------------------------
                        ππππππππππππ π’ππ’ππ π‘ππ  = πππ‘ππππ πΆππππ’ππ π‘π β iππ‘ππππ ππππππ
    EcuaciΓ³n 3 β Diferencia de comparar los intereses totales segΓΊn los tipos de interΓ©s 
------------------------------------------------------------------------------------------------------
Como requerimiento se le solicita que cree una clase llamada Presupuesto, la cual tenga entre sus mΓ©todos uno llamado 
compararProyectos() el cual reciba como parΓ‘metros las tres entradas: 
( int pTiempo, double pMonto, double pInteres ). Haciendo uso de mΓ©todos para calcular el total de intereses simples y 
compuestos, determine la diferencia resultante de comparar las inversiones segΓΊn el tipo de tasa de interΓ©s. Y retorne 
una cadena de texto de la forma: 
   
"La  diferencia  en  el  total  de  intereses  generados  para  el  proyecto,  si  escogemos  entre evaluarlo a una 
tasa de interΓ©s Compuesto y evaluarlo a una tasa de interΓ©s Simple, asciende a la cifra de: $ {compararInversion}."  
 O bien. 
 
"Faltan  datos  para  calcular  la  diferencia  en  el  total  de  intereses  generados  para  el proyecto." 
  
 Ejemplo: ------------------------------------------------------------------------------------------------------
Entradas:  
Nombre                  Tipo                DescripciΓ³n  
pMonto                 double               Valor del equipo 
pInteres               double               InterΓ©s relacionado al valor 
pTiempo                  int                Tiempo de duraciΓ³n  
 
Salida:  
Nombre                  Tipo                 DescripciΓ³n  
compararProyectos      String                 βResultado β {respuesta} 
  */