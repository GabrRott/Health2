
package salud.persona;

public class persona {
    
    
    private String sexo;
    private double peso;
    private double altura;
    private double edad;
    private double IMC;
    private boolean mayor;

    public persona(double IMC, boolean mayor) {
         this.IMC = IMC;
         this.mayor = mayor;
    }

    public persona(String sexo, double peso, double altura, double edad) {
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
       
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getEdad() {
        return edad;
    }

    public double getIMC() {
        return IMC;
    }

    public boolean isMayor() {
        return mayor;
    }
    

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return "persona{" + "sexo = " + sexo + ", peso = " + peso + " kg, altura = " + altura + " m, edad=" + edad + ", IMC = " + IMC + ", mayor = " + mayor + '}';
    }
    
    
    
    


    
}
