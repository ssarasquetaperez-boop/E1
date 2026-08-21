package Ejercicio1;

public class Perro extends Canino implements Domestico{

    public Perro(int id, String especie, String tipo_comida, String habitat) {
        super(id, especie, tipo_comida, habitat);
    }

    
    
    @Override
    public void vacunar(){
        
    }
    @Override
     public void dormir(){
         int random = (int)(Math.random() * (1 - 3 + 1)) + 1;
         for (int i = 0; i < random; i++){
             System.out.println("da una vuelta...");
         }
         System.out.println("zzzzz " + especie + " dormida");
    }
}
