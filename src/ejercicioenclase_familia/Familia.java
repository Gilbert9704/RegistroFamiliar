/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase_familia;

import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class Familia {
    
    private String apellidoFamilia;
    private static Persona[] integrantes;

    //String apellidoFamilia, Persona[] integrantes
    Familia() {
        this.apellidoFamilia = null;
        this.integrantes = new Persona[4];
    }
    
    Familia( int n ) {
        this.apellidoFamilia = null;
        this.integrantes = new Persona[ n ];
    }

    public String getApellidoFamilia() {
        return apellidoFamilia;
    }

    public Persona[] getIntegrantes() {
        return integrantes;
    }

    public void leerPersona( int i ) {
        if( i >= integrantes.length ) {
            System.out.println( "Paila" );
            return ;
        }
        String nombre, apellido, sexo, rol;
        int edad;
        Scanner sc = new Scanner( System.in );
        System.out.println( "Ingrese el nombre" );
        nombre = sc.next( );
        System.out.println("Ingrese el Apellido");
        apellido = sc.next( );
        System.out.println("Ingrese la edad");
        edad = sc.nextInt( );
        System.out.println("Ingrese el sexo");
        sexo = sc.next( );
        System.out.println("Ingrese el Rol");
        rol = sc.next( );
        integrantes[ i ] = new Persona( nombre, apellido, edad, sexo, rol );
    }
    
}