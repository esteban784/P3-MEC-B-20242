//CON LAS CLASES ANTERIORES DE NUMERADOR Y DENOMINADOR CREAR UN METODO PURO QUE ME PERMITA SUMAR DOS FRACCIONES Y QUE ME DEVUELVA EL RESULTADO
public class Fraccion {
    private int numerador;
    private int denominador;

  
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }
    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    } 
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static Fraccion sumar(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
        int nuevoDenominador = f1.denominador * f2.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
    public String toString() {
        return numerador + "/" + denominador;
    }
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(3, 4);
        Fraccion resultado = Fraccion.sumar(f1, f2);
        System.out.println("La suma es: " + resultado);
    }
}
