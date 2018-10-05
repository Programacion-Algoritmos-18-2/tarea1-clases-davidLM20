/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        Metodo persona = new Metodo();
        Metodo persona2 = new Metodo();
        
        System.out.printf("Ingrese el nombre y apellido del estudiante 1\n");
        persona.estudiante1=entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        persona.edad1=entrada.nextInt();
        System.out.println("Ingrese el codigo del estudiante");
        persona.codigo1=entrada.nextInt();
        entrada.nextLine();
        System.out.printf("Ingrese el nombre y apellido del estudiante 2\n");
        persona2.estudiante2=entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        persona2.edad2=entrada.nextInt();
        System.out.println("Ingrese el codigo del estudiante");
        persona2.codigo2=entrada.nextInt();
        
        System.out.println("Lista de estudiantes");
        System.out.println("Nombre         Edad    Codigo");
        System.out.printf("%s\t%d\t%d\n",persona.estudiante1,persona.edad1,persona.codigo1);
        System.out.printf("%s\t%d\t%d\n",persona2.estudiante2,persona2.edad2,persona2.codigo2);
        
               
    }
    
}
