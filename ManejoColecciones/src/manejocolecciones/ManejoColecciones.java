package manejocolecciones;

import java.util.*;

public class ManejoColecciones {

    public static void main(String[] args) {
        
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");        
        //Elemento repetido
        miLista.add("2");
        imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //No permite elementos repetidos, los ignora
        miSet.add("200");
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        //Llave valor
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Pedro");
        miMapa.put("4", "Pepe");
        //Se imprimen todas las llaves
        imprimir(miMapa.keySet());
        //Se imprimen todos los valores
        imprimir(miMapa.values());         
    }
   
    private static void imprimir(Collection coleccion){
        for (Object elemento : coleccion) {
            System.out.println(elemento + " ");
        }
        System.out.println("");
    }
    
}
