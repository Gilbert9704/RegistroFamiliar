/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase_familia;
import java.util.*;
/**
 *
 * @author Camilo
 */
public class RegistroFamiliar {
      
    //private static int i = 0;
    private static Familia[] familias;
    private static String apellidos[] = new String[5];
    
    RegistroFamiliar() {
        this.familias = new Familia[5];
    }
    
    RegistroFamiliar( int n ) {
        this.familias = new Familia[ n ];
    }


    public Familia[] getFamilias() {
        return familias;
    }    
    
    public void verFamilia(String key){
        HashMap<String, Familia> apellidos = new HashMap<String, Familia>();
        
        for(int j=0; j<familias.length; j++){
            apellidos.put(familias[j].getApellidoFamilia(), familias[j]);
            
        }
        System.out.println("Familia : " + key);
        Familia Aux = apellidos.get(key);
        
        if(Aux != null){
            System.out.println(Aux);
          
        }else{
            System.out.println("Familia : " + Aux + "no existe");
        }
        
        
    }
    
    public static void ingresarFamilia( int i,int m ) {
        
        if( i >= familias.length ) {
            System.out.println(" No se puede ");
            return ;
        }
        familias[ i ] = new Familia( );
     
        for( int integrante = 0; integrante < m; integrante++ ) {
            System.out.println( "Ingrese el integrante numero " + (integrante+1) );
            familias[ i ].leerPersona( integrante );
        }
    }
}

/* if (apellidos[i] == null){
            System.out.println("Ingrese el apellido de la familia");
            apellidos[i] = apellido.nextLine();    
*/       