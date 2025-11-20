

/*
 * EJERCICIO 5: Clase Rectángulo
 * 
 * Crea una clase Rectangulo con los siguientes requisitos:
 * - Atributos: ancho (double), alto (double)
 * - Constructor que inicialice ancho y alto (validar que sean > 0)
 * - Método calcularArea() que devuelva el área del rectángulo
 * - Método calcularPerimetro() que devuelva el perímetro
 * - Método esUnCuadrado() que devuelva true si ancho == alto
 * - Métodos getter y setter para ancho y alto
 * - Método toString() que muestre las dimensiones, área y perímetro
 * 
 * En main, crea varios rectángulos y comprueba si son cuadrados,
 * calcula su área y perímetro.
 */
class rectangulo {
    double ancho;
    double alto;

    @Override
    public String toString(){
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", area=" + area() + ", perimetro=" + perímetro() + "]";
    }
    public double area (){
        return ancho*alto;
    }
    public double perímetro (){
        return 2 * (ancho*alto);
    }
    public boolean verificarCuadrado(){
        return ancho == alto;
    }

    public rectangulo(double ancho, double alto) {
        if(ancho <=0 || alto <= 0){
            throw new IllegalArgumentException("el ancho y el alto debe ser mayor a 0");
        }
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if(alto <= 10){
            throw new IllegalArgumentException("el ancho debe ser mayor a 0");
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if(alto <= 10){
            throw  new IllegalArgumentException("el alto debe ser mayor que 0");
        }
    }

   
    

}
public class Ejercicio5 {
    
    // TODO: Implementar aquí
    
    public static void main(String[] args) {
        // TODO: Crear objetos y probar los métodos
        rectangulo numero1 = new rectangulo(20, 10);

        numero1.area();
        numero1.perímetro();
        numero1.verificarCuadrado();
    }
}
