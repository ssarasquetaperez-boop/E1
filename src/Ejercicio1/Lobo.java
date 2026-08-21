package Ejercicio1;

public class Lobo extends Canino {
    
    public Lobo(int id, String especie, String tipo_comida, String habitat) {
        super(id, especie, tipo_comida, habitat);
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Barf Barf!");
        int random = (int)(Math.random() * (4 - 10 + 1)) +1 ;
        System.out.print("A");
        for(int i = 0; i < random; i++){
            System.out.print("u");
        }
    }
    
}
