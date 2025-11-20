class matematica {
    public static int sumar (int a , int b){//modificar de permanencia
        return a+b;
    }
    public double multipicar (int a , int b){//modificar de acesso 
        return a*b;
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        matematica clase = new matematica();

        double resultado = clase.sumar(2, 3);
        System.out.println("el resultado es " + resultado);
    }
}
