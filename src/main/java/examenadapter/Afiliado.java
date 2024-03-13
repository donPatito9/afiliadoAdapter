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
public abstract class Afiliado {
   abstract public void enviarPeticion();
   abstract public void actualizar();
   abstract public void mostrar();
   abstract public void desconectar();
   abstract public void mostrarService();

   public abstract void enviarPeticionService();
}

