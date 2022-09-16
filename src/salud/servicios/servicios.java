
package salud.servicios;

import static java.lang.Math.pow;
import java.util.Scanner;
import salud.persona.Medidas;
import salud.persona.persona;
public class servicios {
    
    private Scanner leer = new Scanner (System.in);
    
    public persona crearPersona(){
    String sexo;
    
    do {    
    System.out.println("ingresar la letra indicada según el sexo [H]hombre, [M]mujer, [O]otro");
    sexo = leer.next();
        if (sexo.equals("M")||sexo.equals("H")||sexo.equals("O")){
            break;
        } else System.out.println("La letra ingresado no corresponde a una respuesta válida");
            
     } while ((sexo.equals("M")||sexo.equals("H")||sexo.equals("O")== false)); 
     
     System.out.println("ingresar peso");
     double peso = leer.nextDouble();
     
     System.out.println("ingresar altura");
     double altura = leer.nextDouble();
     
     System.out.println("ingresar edad");
     double edad = leer.nextDouble();
     
    return new persona(sexo, peso, altura, edad);
     
    }
     
    
     
     
     
     
      public double calcularIMC(double peso, double altura){
         int indicador = 0;
         double IMC = peso/ pow(altura,2);
         if (IMC <20){
             indicador = -1;
         }
         if (IMC >=20 && IMC <=25){
             indicador = 0;
         }
         if (IMC > 25){
             indicador = 1;
         }
         return indicador;
     
    } 
      public boolean esMayorDeEdad(double edad){
          boolean mayor = false;
          if (edad >= 18){
              mayor = true;
          }
         return mayor;
     }
      
      public void printMedida(String [] a){
        System.out.println("Las medidas de pecho, cintura y cadena son las siguientes:");
          try{
          for (int i = 0; i < 10; i++) {
              System.out.println(a[i]);
          }
          }catch (ArrayIndexOutOfBoundsException e){
              System.out.println("El listado contiene sólo 3 datos. La solicitud excedió ese límite");
          }
      }
     
}
