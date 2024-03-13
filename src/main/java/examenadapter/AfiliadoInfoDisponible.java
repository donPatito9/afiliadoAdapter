/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenadapter;

/**
 *
 * @author Robinson Concha
 */
public class AfiliadoInfoDisponible {
    private boolean conectado = false;
    
    public AfiliadoInfoDisponible(){
    System.out.println("********************************************************");
    this.conectado = false;
    }

   
    public void enviarPeticion(){
    System.out.println("conectando.....");
    this.conectado = true;
    }
    public void actualizar(){
       if(!this.conectado){
       System.out.println("No se puede actualizar informacion por que no "
               + "esta conetado el  servicio");
              }else{
              System.out.println("Esta conectado, recuperando informacion " + "WebService...");
        }
    }
    
    public void mostrarService(){
    if(!this.conectado){
    System.out.println("No se puede mostrar Servicio Stock " + "por que no esta conectado");
    }else{
    System.out.println("Mostrando Informacion... ApiRestStockService");
   
    }
    }
    public void desconectar(){
    this.conectado = false;
}

    public void mostrar() {
       
    }
   
}

