package Ejercicio1;

public class Perro extends Canino implements Domestico{
    
    public boolean adoptado = false;

    public Perro(int id, String especie, String tipo_comida, String habitat) {
        super(id, especie, tipo_comida, habitat);
    }
    
    public boolean estaAdopatdo(){
        return adoptado;
    }
    public void adoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    
    
    @Override
    public void vacunar(){
        System.out.println("se vacuno de moquillo");
        
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
