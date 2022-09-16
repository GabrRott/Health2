
package salud.persona;


public class Medidas {
    private String[] pechoCinturaCadera;

    public Medidas() {
    }

    public Medidas(String[] pechoCinturaCadera) {
        this.pechoCinturaCadera = pechoCinturaCadera;
    }

    public String[] getPechoCinturaCadera() {
        return pechoCinturaCadera;
    }

    public void setPechoCinturaCadera(String[] pechoCinturaCadera) {
        this.pechoCinturaCadera = pechoCinturaCadera;
    }
    
    public void printMedidas(){
        System.out.println("Las medidas de pecho, cintura y cadena son las siguientes:");
          try{
          for (int i = 0; i < 10; i++) {
              System.out.println(pechoCinturaCadera[i]);
          }
          }catch (ArrayIndexOutOfBoundsException e){
              System.out.println("El listado contiene sólo 3 datos. La solicitud excedió ese límite");
          }
      }
    
}


