package Ejercicio1;

public class Canino extends Animal {

    public Canino(int id, String especie, String tipo_comida, String habitat) {
        super(id, especie, tipo_comida, habitat);
    }
    
    
    public void ladrar(){
    
    }
    @Override
     public void dormir(){
        System.out.println("zzzzz " + especie + " dormida");
    }
}
