/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase_familia;
import java.util.*;
import java.util.HashMap;
/**
 *
 * @author Camilo
 */
public class EjercicioEnClase_Familia {
    public static int n = 0;
    public static int m = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistroFamiliar registrar = new RegistroFamiliar();
        Scanner accion = new Scanner(System.in);
        Familia familia = new Familia();
        byte comando = 0;
        do{
           System.out.println("Registro Familiar ¿Qué desea? \n -Ingresar nueva Familia(1) \n -Consultar Familia(2) \n -Consultar Miembro de Familia(3)");
           comando = accion.nextByte();
           switch (comando){
            case 1:
                System.out.println("Ingrese el numero de Familias a Registrar : ");
                Scanner nn = new Scanner(System.in);
                n = nn.nextInt();
                int h =1;
                for(int j = 0; j<n ; j++){
                System.out.println("Familia : " + h);
                System.out.println("Ingrese el numero de Integrates : ");
                Scanner mm = new Scanner(System.in);
                m = mm.nextInt();
                registrar.ingresarFamilia( n,m );
                h++;
            }
                
                break;
            
            case 2:
                break;
            
            case 3:
                
                break;
            default :
                break;
            
        }
           
        }while (comando <= 3);
        
    }
    
}
