
package pilaDinamica_2;

//en mvc esta seria la vista
public class Main {
    public static void main(String[] args) {
        //Aca se especifica el tipo de dato
        Pila<Integer> pilasNumeros=new Pila<>();
        
        //Antes de insertar elementos en la pila invocamos el
        //metodo isEmpty saldrá true indicando que esta vacia
        
        System.out.println(pilasNumeros.isEmpty());
        
        //Insertar un elemento con el metodo push
        pilasNumeros.push(5);
        pilasNumeros.push(8);
        pilasNumeros.push(2);
        pilasNumeros.push(1);
        
        //Ahora nuevamente con isEmpty saldra false quiere decir que
        //esta llena
        System.out.println(pilasNumeros.isEmpty());
        
        //Verificar el tamaño
        System.out.println(pilasNumeros.size());
        
        
        System.out.println("");
        System.out.println("Elementos de la pila");
        //Ahora un recorrido por la pila
        System.out.println(pilasNumeros.toString());
        
        //Quitar un elemenoto
        pilasNumeros.pop();
        System.out.println(pilasNumeros.toString());
        
        
        System.out.println("");
        System.out.println("Muestra el ultimo elemento");
        //Mostrar el último elemento
        System.out.println(pilasNumeros.top());
        
        
        
    }
}
