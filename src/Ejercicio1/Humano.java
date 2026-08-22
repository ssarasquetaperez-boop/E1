package Ejercicio1;

import java.util.*;

public class Humano {
    String nombre;
    int edad;
    Perro perro;

    public Humano(String nombre, int edad, Perro perro) {
        this.nombre = nombre;
        this.edad = edad;
        this.perro = perro;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Perro getPerro() {
        return perro;
    }
    public void adoptarPerro(HashMap<Integer, Animal> animales, int id){
        if(this.perro != null){
            System.out.println("Ya tiene un perro");
            return;
        }
        Animal a = animales.get(id);
        if (a instanceof Perro p && !p.estaAdopatdo()){
            this.perro = p;
            p.adoptado(true);
            System.out.println(nombre + " adopto perro de raza " + p.getEspecie());
        }
    }

    void adoptarPerro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
