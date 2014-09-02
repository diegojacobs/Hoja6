/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja6;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
/**
 *
 * @author Diego Jacobs 13160
 * @author Roberto Chiroy   13027
 */
public class Hoja6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner _in  = new Scanner(System.in);
        Set celular;
        Set java;
        Set web;
        
        int tipo = 0;
        System.out.println("Escoge que tipo de conjunto desea trabajar: ");
        System.out.println("1. HashSet");
        System.out.println("2. TreeSet");
        System.out.println("3. LinkedHashSet");
        tipo = _in.nextInt();
        int opcion = 0;
        while (opcion != 3)
        {
            System.out.println("Escoge una opcion: ");
            System.out.println("1. Ingresar nueva persona");
            System.out.println("2. Desplegar conjunto mas grande");
            System.out.println("3. Salir");
            opcion = _in.nextInt();
            
            if (opcion == 1)
            {
                String name;
                int opcion2 = 0;
                System.out.println("Ingrese Nombre: ");
                name = _in.nextLine();
                System.out.println("Indique de que conjuntos es parte: ");
                System.out.println("1. Web");
                System.out.println("2. Java");
                System.out.println("3. Celular");
                System.out.println("4. Web y Java");
                System.out.println("5. Web y Celular");
                System.out.println("6. Java y Celular");
                System.out.println("7. Web, Java y Celular");
                opcion2 = _in.nextInt();
            }
        }
    }
    
}
