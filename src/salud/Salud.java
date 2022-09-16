package salud;

import salud.persona.Medidas;
import salud.persona.persona;
import salud.servicios.servicios;

public class Salud {

        public static void main(String[] args) {
        
        double imc1=0;
        double imc0 = 0;
        double imc01 = 0;
        double Mayor;
        servicios salud = new servicios();
        persona p1 = null;
        String[] array = new String[] {"90","60","90"};
        Medidas m1 = new Medidas(array);
//        persona p1 = salud.crearPersona();
//        persona p2 = salud.crearPersona();
//        persona p3 = salud.crearPersona();
//        persona p4 = salud.crearPersona();
    
        
       try {
           p1.setMayor(salud.esMayorDeEdad(p1.getEdad()));
           System.out.println("La persona es mayor de edad? "+ p1.isMayor());
       } catch(Exception e){
           System.out.println("La persona no tiene definido su edad");
       }
       
       salud.printMedida(m1.getPechoCinturaCadera());
       
       
       // p1.setIMC(salud.calcularIMC(p1.getPeso(), p1.getAltura()));
       // p2.setIMC(salud.calcularIMC(p2.getPeso(), p2.getAltura()));
       // p3.setIMC(salud.calcularIMC(p3.getPeso(), p3.getAltura()));
       // p4.setIMC(salud.calcularIMC(p4.getPeso(), p4.getAltura()));
        
               
       // p1.setMayor(salud.esMayorDeEdad(p1.getEdad()));
       // p2.setMayor(salud.esMayorDeEdad(p2.getEdad()));
       // p3.setMayor(salud.esMayorDeEdad(p3.getEdad()));
       // p4.setMayor(salud.esMayorDeEdad(p4.getEdad()));

       //     System.out.println(p1);
       //     System.out.println(p2);
       //     System.out.println(p3);
       //     System.out.println(p4);
    
           
           
//    if (p1.getIMC()== 1){
//        imc1=1;
//            }
//    if (p1.getIMC()== 0){
//        imc0=1;
//            }
//    if (p1.getIMC()< 0){
//        imc01=1;
//            }
// /*   if (p2.getIMC()== 1){
//        imc1+=1;
//            }
//    if (p2.getIMC()== 0){
//        imc0+=1;
//            }
//    if (p2.getIMC()< 0){
//        imc01+=1;
//            }
//    if (p3.getIMC()== 1){
//        imc1+=1;
//            }
//    if (p3.getIMC()== 0){
//        imc0+=1;
//            }
//    if (p3.getIMC()< 0){
//        imc01+=1;
//            }
//    if (p4.getIMC()== 1){
//        imc1+=1;
//            }
//    if (p4.getIMC()== 0){
//        imc0+=1;
//            }
//    if (p4.getIMC()< 0){
//        imc01+=1;
//            }
//    
//    */
//            System.out.println("Promedio de sobrepeso " + imc1/4);
//            System.out.println("Promedio de peso ideal " + imc0/4);
//            System.out.println("Promedio de bajopeso " + imc01/4);
//        
//        
//        
    }
    
}
