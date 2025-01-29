/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author andre
 */
public class Perro extends Canido {  
    @Override
    public String getSonido() {
        return "Ladrido";
    }
    @Override
    public String getAlimentos() {
        return "Carnivoro";
        }
    @Override
    public String getHabitat() {
        return "Domestico";
    }
    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }

}//final break