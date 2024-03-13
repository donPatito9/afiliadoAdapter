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
public class AfiliadoInfoActual extends Afiliado {


    public AfiliadoInfoActual(){
   super();
   System.out.println("Stock Actual Del sistema");
   } 
   @Override
   public void enviarPeticion(){
       System.out.println("enviando Peticion stock");
   }
   @Override
   public void enviarPeticionService(){
       System.out.println("enviando Peticion WebService");
   }
   
    @Override
    public void actualizar(){
    System.out.println("actualizando Informacion");
   }
  @Override
    public void mostrarService(){
    System.out.println("Mostrando Informacion StockService");
   }
   @Override
    public void mostrar(){
    System.out.println("Mostrando Informacion Stock");
   }
   
   @Override
   public void desconectar() {
   System.out.println("Desconectando Servicio");
   }

   
}

 