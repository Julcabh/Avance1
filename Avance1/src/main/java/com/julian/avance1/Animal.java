/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julian.avance1;

/**
 *
 * @author Julian
 */
public class Animal {
    
    String Nombre;
    int Codigo;

    public Animal(){
    }
    public Animal(String Nombre, int Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    @Override
    public String toString() {
        return "Animal{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + '}';
    }
    
    public void Comer(){
        
    }
      
}
