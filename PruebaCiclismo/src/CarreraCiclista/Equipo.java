
package CarreraCiclista;

import java.util.*;


public class Equipo {
    private String nombre; // Atributo que define el nombre del equipo de ciclismo
    private static double totalTiempo; // Atributo que define el tiempo total obtenido por el equipo
    private String país; // Atributo que define el país al que pertenece el equipo
    Vector listaCiclistas; // Atributo que define un vector de objetos ciclista


    public Equipo(String nombre, String país) {
        this.nombre = nombre;
        this.país = país;
        totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
        listaCiclistas = new Vector(); // Se crea el vector de ciclistas que conforma el equipo
    }
    public String getNombre() {
    return nombre;
    }
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    private String getPaís() {
    return país;
    }
    private void setPaís(String país) {
    this.país = país;
    }
    void añadirCiclista(Ciclista ciclista) {
    listaCiclistas.add(ciclista);
    }
    void listarEquipo() {
    for (int i = 0; i < listaCiclistas.size(); i++) {
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
        System.out.println(c.getNombre());
    }
    }
    void buscarCiclista() {
    Scanner sc = new Scanner(System.in);
    String nombreCiclista = sc.next();
    for (int i = 0; i < listaCiclistas.size(); i++) {
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
        if (c.getNombre().equals(nombreCiclista)) {
            System.out.println(c.getNombre());
            }
        }
    }
    void calcularTotalTiempo() {
    for (int i = 0; i < listaCiclistas.size(); i++) {
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
        totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }
    void imprimir() {
    System.out.println("Nombre del equipo = " + nombre);
    System.out.println("Pais = " + país);
    System.out.println("Total tiempo del equipo = " + totalTiempo);
    }

}
