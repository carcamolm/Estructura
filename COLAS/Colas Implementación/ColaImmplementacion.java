
package colaimmplementacion;

import javax.swing.JOptionPane;


public class ColaImmplementacion {

    
    public static void main(String[] args) {
       int opcion=0, elemento=0;
       Cola fila=new Cola();
       
       do{
           try {
              opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1.  Insertar un elemento en la Cola\n"
                      +"2. Quitar un elemento de la Cola\n"
                      +"3. ¿La Cola está vacía? \n"
                      +"4. Elemento ubicado al Inicio de la Cola \n"
                      +"5. Tamaño de la Cola\n"
                      +"6. Salir","Menú de Opciones Cola",JOptionPane.QUESTION_MESSAGE));
              switch(opcion){
                  case 1:
                      elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a Insertar","Insertando en la Cola",JOptionPane.QUESTION_MESSAGE));
                      fila.insertar(elemento);
                      break;
                  case 2:
                      if(!fila.estaVacia()){
                          JOptionPane.showMessageDialog(null,"El Elemento Atendido es  "+fila.quitar(),"Quitando Elementos de la Cola",JOptionPane.INFORMATION_MESSAGE);
                      }else{
                          JOptionPane.showMessageDialog(null, "La Cola está Vacía","Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                          
                      }
                      break;
                  case 3:
                      if(fila.estaVacia()){
                          JOptionPane.showMessageDialog(null, "La Cola está Vacía","Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                      }else{
                          JOptionPane.showMessageDialog(null, "La Cola No está Vacía","Cola No Vacía",JOptionPane.INFORMATION_MESSAGE);
                      }
                      
                      break;
                  case 4:
                        if(!fila.estaVacia()){
                              JOptionPane.showMessageDialog(null, "El elemento ubicado al Inicio de la Cola es "+fila.inicioCola(),
                                      "Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La Cola está Vacía","Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                      
                      break;
                  case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la  Cola es: "+fila.tamaCola(),
                                      "Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                      break;
                  case 6:
                       JOptionPane.showMessageDialog(null, "Aplicación finalizada","Fin" ,JOptionPane.INFORMATION_MESSAGE);
                      break;
                  default:
                       JOptionPane.showMessageDialog(null, "Opción Incorrectoa","Seleccione bien",JOptionPane.INFORMATION_MESSAGE);
                      
                          
              }
                  
           } catch (NumberFormatException n) {
               
               JOptionPane.showInternalMessageDialog(null,"Error  "+n.getMessage());
           }
       
       
       }while(opcion!=6);
       
    }
    
}
