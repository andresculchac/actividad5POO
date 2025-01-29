/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author andre
 */
public class Lobo extends Canido {
    
    @Override
    public String getSonido(){
        return "Aullido";
    }
    @Override
    public String getAlimentos(){
        return "Carnivoro";
    }

    @Override
    public String getNombreCientifico() {
        return"Canis lupus";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }
    
    
}
