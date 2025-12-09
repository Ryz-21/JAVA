import  java.util.*;
public class Ejercicio1 {

    //1. Duplicar cada número de una lista Recorre la lista con un for y agrega numero * 2 a una nueva lista.
    public static void main(String[] args) {
        List<Integer> listaOrginal = Arrays.asList(1,2,3,4,5,6);
        Ejercicio1 metodo = new Ejercicio1();
        List<Integer> listaDuplicada = metodo.duplicado(listaOrginal);
        System.out.println("la lista original es " + listaOrginal);
        System.out.println("lista nueva es " + listaDuplicada);
    }

    public List <Integer> duplicado (List<Integer> lista){
        List<Integer> nueva = new ArrayList<>();
        for (int n : lista) {
            nueva.add(n * 2);
        }
        return  nueva;
    }
}
