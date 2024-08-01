/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;




/**
 *
 * @author DIANA CAROLINA
 */
public class Cliente {
  private String nombre;
  private int edad;
  private char genero;
  private final Long id;
  

    public Cliente(String nombre, int edad, char genero, long id) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public long getId() {
        return id;
    }

    
  
 
 
}
