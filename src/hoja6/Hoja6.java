/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja6;

import java.util.Scanner;

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
        
        int opcion = 0;
        while (opcion != 3)
        {
            System.out.print("Escoge una opcion: ");
            System.out.print("1. Ingresar nueva persona");
            System.out.print("2. Desplegar conjunto mas grande");
            System.out.print("3. Salir");
            opcion = _in.nextInt();
            
            if (opcion == 1)
            {
                String name;
                int opcion2 = 0;
                System.out.print("Ingrese Nombre: ");
                name = _in.nextLine();
                System.out.print("Indique de que conjuntos es parte: ");
                System.out.print("1. Web");
                System.out.print("2. Java");
                System.out.print("3. Celular");
                System.out.print("4. Web y Java");
                System.out.print("5. Web y Celular");
                System.out.print("6. Java y Celular");
                System.out.print("7. Web, Java y Celular");
                opcion2 = _in.nextInt();
            }
        }
    }
    
}
