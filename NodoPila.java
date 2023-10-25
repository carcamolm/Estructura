
package pilaDinamica_2;
//Este en mvc sería el modelo
public class NodoPila<T> {
    //El elemento T es de tipo de dato genérico
    //sirve para cualquier tipo de dato
    //Se utiliza T por convensión
    //Esta clase contiene los get y los set
    //Atributos
    private T elemento;
    private NodoPila<T> siguiente; //Apunta al siguiente nodo

    //Contructor
    public NodoPila(T elemento, NodoPila<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    //Metodos
    /*En donde estoy generando
      mi metodo de tipo T para el get de elemento
      donde me regresa el elemento que en este caso es T
    */
    public T getElemento() {
        return elemento;
    }

     /*Tengo mi metodo setElemento, donde recibo un elemento de tipo
       T y lo recibo de manera privada para hacerlo publico*/
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoPila<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    //toString=muestra el estado de la pila
    public String toString() {
        return elemento + "\n";
    }
}
