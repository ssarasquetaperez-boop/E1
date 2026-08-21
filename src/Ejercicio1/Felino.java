
package Ejercicio1;


public abstract class Felino extends Animal {
    private double altura;
    private double velocidad;

    public Felino(int id, String especie, String tipo_comida, String habitat) {
        super(id, especie, tipo_comida, habitat);
    }
    
    public void rugir(){
    
    }
    
    public abstract void saltar();
    
}
