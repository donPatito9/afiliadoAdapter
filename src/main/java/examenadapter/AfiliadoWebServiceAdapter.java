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
public class AfiliadoWebServiceAdapter  extends Afiliado {
    private AfiliadoInfoDisponible afiliadoInfo;
   
   public AfiliadoWebServiceAdapter(){
   super();
   this.afiliadoInfo = new AfiliadoInfoDisponible();
   System.out.println("*****restProductoStock******....");
   
  }
       @Override
        public void enviarPeticion(){
        System.out.println("enviando peticion ");
        this.afiliadoInfo.enviarPeticion();
       
}
        @Override
        public void enviarPeticionService(){
        System.out.println("enviando peticion a API");
        this.afiliadoInfo.enviarPeticion();
       
}
       @Override
        public void actualizar(){
        System.out.println("Actualizando Informacion...");
        this.afiliadoInfo.actualizar();
        }
        @Override
        public void mostrarService(){
        System.out.println("Mostrando Informacion WebService");
        this.afiliadoInfo.mostrarService();
        }  
         @Override
        public void mostrar(){
        System.out.println("Mostrando Informacion Actual");
        this.afiliadoInfo.mostrarService();
        

        }
         @Override
        public void desconectar(){
        System.out.println("Desconectando servicio");
        this.afiliadoInfo.desconectar();

        }
 }


