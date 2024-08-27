##con la misma clase de numerador y denominador crear una sobre carga del constructor y crear 1 objeto para cada una de sus formas en lenguaje java

public class Fraccion {
    private int numerador;
    private int denominador;

 
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1; 
    }

    
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

   
    public Fraccion(int numerador) {
        this(numerador, 1); 
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        
        Fraccion fraccion1 = new Fraccion();              
       Fraccion fraccion3 = new Fraccion(5);                
        
        System.out.println("Fracción por defecto: " + fraccion1); 
        System.out.println("Fracción con numerador y denominador: " + fraccion2); 
        System.out.println("Fracción con solo numerador: " + fraccion3);
    }
}

      Fraccion fraccion2 = new Fraccion(3, 4);            
   
