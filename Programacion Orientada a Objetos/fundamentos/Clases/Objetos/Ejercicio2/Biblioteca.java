package Ejercicio2;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {

    private class Estante {

        private String seccion;
        private List<Material> Materiales = new ArrayList<>();

        public Estante (String seccion){
            this.seccion = seccion;
        }

        public void Agregar (Material m){
            Materiales.add(m);
        }

        public List<Material> getMaterials(){
            return Materiales;
        }

    
    }
    
        private Estante EstanteGeneral = new Estante("General");

        public void agregarMaterial (Material m){
            EstanteGeneral.Agregar(m);
        }

        public void listarPrestables (){
            for (Material m : EstanteGeneral.getMaterials()) {
                if(m.puedePrestarse()){
                    System.out.println(m.getTitulo() + "se puede prestar");
                }
            }
        }
}