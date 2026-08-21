package Ejercicio1;

public class Humano {
    String nombre;
    int edad;
    Perro perro;

    public Humano(String nombre, int edad, Perro perro) {
        this.nombre = nombre;
        this.edad = edad;
        this.perro = null;
        
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
    public void adoptarPerro(Perro p){
        if(this.perro == null){
            this.perro=p;
            System.out.println(nombre + "adopto perro de raza " + p.getEspecie());
        }else {
            System.out.println(nombre +  "ya tiene un perro");
        }
    }
    
    
}
