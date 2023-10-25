
package pilaDinamica_2;


public class Pila<T>  {
    //Aqui se realizan las operaciones que se van a realizar con ese
    //nodo(En mvc este sería el controlador)
    
    //Atributos
    private NodoPila<T> top; //Ultimo nodo que se ha incluido en la lista
    private int tamanio;

    //Constructor vacio
    public Pila() {
        top = null; //No hay elementos, cuando la pila invoque
        //al constructor vacio la pila estara en null
        this.tamanio = 0;
    }

    /**
     * Indica si esta vacia o no
     *
     * @return
     */
    
    //Metodo para indicar si está vacia isEmpty es el estandar
    public boolean isEmpty() {
        return top == null;
    }//Si se cumple regresa un true sino un false y se sabe que la
    //pila no esta vacia

    /**
     * Indica el tamaño
     *
     * @return
     */
    
    //Metodo para el tamaño de la pila
    public int size() {
        return this.tamanio;
    }

    /**
     * Devuelve el que esta más arriba en la pila
     *
     * @return
     */
    //Este método devuelve el elemento que se encuentra en la 
    //parte superior de la pila. Devuelve T, porque no se sabe
    //el tipo de dato
    public T top() {
        if (isEmpty()) {//Primero se valida si está vacio
            return null;
        } else {
            return top.getElemento();
        }
    }

    /**
     * Saca y devuelve el elemento que mas arriba esta en la pila
     *solo puede retirar el de la parte superior,
     * en este caso elemento T
     * @return
     */
    public T pop() {
        if (isEmpty()) {//Si se encuentra vacio
            return null;
        } else {//Si tiene elementos
            T elemento = top.getElemento();
            NodoPila<T> aux = top.getSiguiente();//Esta es la última direccion
            top = null; //marco para borrar
            top = aux; //actualizo el top
            this.tamanio--;
            return elemento;//aqui se regresa el elemento
        }
    }

    /**
     * Mete un elemento a la pila
     *
     * @param elemento
     * @return
     */
    
    /*public T push(T elemento) {
                                    //<> especifica que es generico
        NodoPila<T> aux = new NodoPila<>(elemento, top);
        top = aux; //actualizo el top
        this.tamanio++;//se incrementa el tamaño
        return aux.getElemento();
    }*/
    public void push(T elemento) {
                                    //<> especifica que es generico
        NodoPila<T> aux = new NodoPila<>(elemento, top);
        top = aux; //actualizo el top
        this.tamanio++;//se incrementa el tamaño
      }

    /**
     * Devuelve el estado de la pila
     *imprime la pila
     * @return
     */
    public String toString() {
        //Validar que no se encuentre vacia la pila
        if (isEmpty()) {
            return "La pila esta vacia";
        } else {

            String resultado = "";
            NodoPila<T> aux = top;
            //Recorro la pila
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();//debo hacer que aux
                //se mueva a la siguiente direccion de memoria
            }

            return resultado;

        }

    }
}
