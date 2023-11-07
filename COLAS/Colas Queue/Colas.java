
package colas;

import java.util.Queue;
import java.util.LinkedList;
public class Colas {

    
    public static void main(String[] args) {
        // Importar la clase
        Queue<String> nombres=new LinkedList();
        
        /*
        Métodos
        offer(e). adiciona elementos
        poll(). elimina elementos
        peek(). muestra el elemento
        */
        nombres.offer("Lina");
        nombres.offer("Ana");
        nombres.offer("Sergio");
        nombres.offer("Ramon");
        nombres.offer("Lucas");
        

        //Mostrar los elemento
        System.out.println(nombres);
        
        
        System.out.println("");
        //Mostrar el primer nombre
        System.out.println("Primer nombre: "+nombres.peek());
        
        //Tamaño de la cola
        int tamano=nombres.size();
        System.out.println("Tamaño Cola: "+tamano);
        
                
        //Despachando al primer elemento
      System.out.println("Despachando el primer elemento: "+nombres.remove());
       System.out.println(nombres);
        
        //Vaciar la cola
       System.out.println("Vaciando Cola:");
        nombres.clear();
         System.out.println(nombres);
     
        
    }
    
}
