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
import java.util.Arrays;
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
        
        SetFactory fact = new SetFactory();
        
        int tipo = 0;
        System.out.println("Escoge que tipo de conjunto desea trabajar: ");
        System.out.println("1. HashSet");
        System.out.println("2. TreeSet");
        System.out.println("3. LinkedHashSet");
        System.out.println("Ingrese su opcion: ");
        tipo = _in.nextInt();
        
        celular = fact.GetSet(tipo);
        java = fact.GetSet(tipo);
        web = fact.GetSet(tipo);
            
        int opcion = 0;
        while (opcion != 4)
        {
            System.out.println("Escoge una opcion: ");
            System.out.println("1. Ingresar nueva persona");
            System.out.println("2. Ver si es un subconjunto");
            System.out.println("3. Desplegar conjunto mas grande");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = _in.nextInt();
            
            if (opcion == 1)
            {
                String name = "";
                int opcion2 = 0;
                while (name  == "")
                {
                    System.out.println("Ingrese Nombre: ");
                    name = _in.next();
                }
                System.out.println("Indique de que conjuntos es parte: ");
                System.out.println("1. Web");
                System.out.println("2. Java");
                System.out.println("3. Celular");
                System.out.println("4. Web y Java");
                System.out.println("5. Web y Celular");
                System.out.println("6. Java y Celular");
                System.out.println("7. Web, Java y Celular");
                System.out.println("Ingrese su opcion: ");
                opcion2 = _in.nextInt();
                
                switch (opcion2){
                    case 1: web.add(name);
                    case 2: java.add(name);
                    case 3: celular.add(name);
                    case 4: {
                        web.add(name);
                        java.add(name);
                    }
                    case 5:{
                        web.add(name);
                        celular.add(name);
                    }
                    case 6:{
                        java.add(name);
                        celular.add(name);
                    }
                    case 7:{
                        web.add(name);
                        java.add(name);
                        celular.add(name);
                    }
                }
            }
            if (opcion == 2){
                if (web.containsAll(java))
                    System.out.println("Java es un subconjunto de web.");
                else
                    System.out.println("Java no es un subconjunto de web.");
            }
            if (opcion == 3){
                int tamw = web.size();
                int tamj = java.size();
                int tamc = celular.size();
                if ((tamw >= tamj) && (tamj >= tamc)){
                    System.out.println("El conjunto mas grande es web: ");
                    System.out.println(web.toString());
                    System.out.println("De forma ascendente es: ");
                    String[] cadena = new String[tamw];
                    web.toArray(cadena);
                    Arrays.sort(cadena);
                    System.out.println(Arrays.toString(cadena));
                }
                else if ((tamj >= tamw) && (tamw >= tamc)){
                    System.out.println("El conjunto mas grande es java: ");
                    System.out.println(java.toString());
                    System.out.println("De forma ascendente es: ");
                }
                else if ((tamc >= tamw) && (tamw >= tamj)){
                    System.out.println("El conjunto mas grande es celulares: ");
                    System.out.println(celular.toString());
                    System.out.println("De forma ascendente es: ");
                }
            }
                        
        }
    }
}
    
