/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author andre
 */
public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico; 
    
    
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
    public abstract String getNombreCientifico();
    
    
 }

