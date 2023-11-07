/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaimmplementacion;

/**
 *
 * @author luzme
 */
public class Cola {
    NodoCola inicio, fin; //punteros
    int tama;
    
    //Constructor
    public Cola(){
        inicio=fin=null;
        tama=0;
    }
    
    //Método para saber si esta vacia la cola
    public boolean estaVacia(){
        return inicio==null;
    }
    
    //Método para insertar
    public void insertar(int ele){
      NodoCola nuevo= new NodoCola(ele);  //Se inserta por el final nunca por el niicio
      if(estaVacia()){
          inicio=nuevo; //El nuevo nodo va a ser el inicio
      }else{
          fin.siguiente=nuevo;
      }
      fin=nuevo;
      tama++;
    }
    
    //Quitar elemento de la cola
    
    public int quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tama--;
        return aux;
    }
    
    //Método para saber quien está al inicio de la cola
    public int inicioCola(){
        return inicio.dato;
    }
    
    //Método para saber el tamaño de la cola
    public int tamaCola(){
        return tama;
    }
}
