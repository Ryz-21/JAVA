/*
Ejercicio 3 — Polimorfismo con figuras geométricas (áreas)

Enunciado:
Implementa una jerarquía de figuras geométricas para calcular áreas. Crea una clase abstracta `Figura` con el
método abstracto `public double calcularArea()` y/o `public double perimetro()` si lo deseas. Implementa las clases
`Circulo`, `Rectangulo` y `Triangulo` que sobrescriban `calcularArea()` adecuadamente.

Tareas:
- Definir `Figura` con el método `calcularArea()`.
- Implementar `Circulo`, `Rectangulo` y `Triangulo` con sus propiedades (radio, base/altura, etc.).
- Escribe un método que reciba una colección de `Figura` y devuelva el área total sumada usando polimorfismo.

Opcional: Añade un método `esMayorQue(Figura otra)` que compare áreas (puede compartir código usando polimorfismo).
*/

abstract class figura {
    public abstract double calcularArea(); 
}

class Circulo extends figura {

    private double radio;
    public Circulo (double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea (){
    return Math.PI*radio* radio;
    }
}

class Rectangulo extends figura {
    private double altura;
    private double base;

    public Rectangulo (double base, double altura){
     this.altura = altura;
     this.base = base;
    }

    @Override
    public double calcularArea (){
        return base*altura;
    }
}

class Triangulo extends figura {
    private double altura;
    private double base;

    public Triangulo (double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return (base*altura) / 2;
    }
}

public class Ejercicio3 { 
    
public static double areaTotal(figura[] figuras){
  double total = 0;
    for (figura f : figuras){
        total += f.calcularArea();
    }
    return total;
}
    public static void main(String[] args) {
        figura[] figuras = {new Rectangulo(4,6), new Triangulo(3,8), new Circulo(0)};

        System.out.println("Área total = " + areaTotal(figuras));
    }
}