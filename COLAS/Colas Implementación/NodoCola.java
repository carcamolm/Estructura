
package colaimmplementacion;


public class NodoCola {
    int dato;
    NodoCola siguiente;  //puntero de tipo cola
    
    //Constructor
    public NodoCola(int d){
        dato=d;
        siguiente=null;
    }
}
