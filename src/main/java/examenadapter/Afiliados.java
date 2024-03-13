/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenadapter;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.json.*;
/**
 *
 * @author Robinson Concha
 */
public class Afiliados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
        // TODO code application logic here
    Afiliados miPrincipal = new Afiliados();
    URL url = new URL("http://localhost:8080/RestExamen/rest/preonline/afiliados");
    
      HttpURLConnection cx=(HttpURLConnection)url.openConnection();
      cx.setRequestMethod("GET");
      
      InputStream strm = cx.getInputStream();
      byte[] arrStream=strm.readAllBytes();
      
      String cntJson="";
      
      for(byte tmp: arrStream)
          cntJson +=(char)tmp;
      
      JSONArray json=new JSONArray(cntJson);
      
      //for(Object obj: json)
        System.out.println(new JSONObject(((JSONObject)obj).get("id").toString()).get("name"));
      }
   
}




 /*       System.out.println("**************************************");
        System.out.println("\n******Stock actual en el sistema******");
        System.out.println("**************************************");
        miPrincipal.mostrarInfoActual();
        //miPrincipal.mostrarStock();
        System.out.println("**************************************\n");
        System.out.println("******Stock Adaptader webService********");
        miPrincipal.mostrarInfoDisponible();
        System.out.println("**************************************\n"); 
        System.out.println("**************************************\n");
    }

    private void mostrarInfoActual(){
        Afiliado infoAfi = new AfiliadoInfoActual();
        
        infoAfi.enviarPeticion();
        //stock.actualizar();
        infoAfi.mostrar();
        //stock.desconectar();
    }
    
     private void mostrarInfoDisponible(){
        Afiliado infoAfi = new AfiliadoWebServiceAdapter();
        infoAfi.enviarPeticionService();
        infoAfi.actualizar();
        infoAfi.mostrarService();
        infoAfi.desconectar();
    }
     
    
    
}
*/    