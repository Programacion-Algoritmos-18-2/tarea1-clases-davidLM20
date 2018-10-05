/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author David Lopez
 */
public class Metodo {
    //creando variables 
    String estudiante1;
    int edad1;
    int edad2;
    String estudiante2;
    int codigo1;
    int codigo2;
    //formando gets
    public String getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(String estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public int getEdad1() {
        return edad1;
    }

    public void setEdad1(int edad1) {
        this.edad1 = edad1;
    }

    public int getEdad2() {
        return edad2;
    }

    public void setEdad2(int edad2) {
        this.edad2 = edad2;
    }

    public String getEstudiante2() {
        return estudiante2;
    }

    public void setEstudiante2(String estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public int getCodigo1() {
        return codigo1;
    }

    public void setCodigo1(int codigo1) {
        this.codigo1 = codigo1;
    }

    public int getCodigo2() {
        return codigo2;
    }

    public void setCodigo2(int codigo2) {
        this.codigo2 = codigo2;
    }

    public Metodo(String estudiante1, int edad1, int edad2, String estudiante2, int codigo1, int codigo2) {
        this.estudiante1 = estudiante1;
        this.edad1 = edad1;
        this.edad2 = edad2;
        this.estudiante2 = estudiante2;
        this.codigo1 = codigo1;
        this.codigo2 = codigo2;
    }

    public Metodo() {
    }
    
    
    
    
}
