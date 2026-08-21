package Ejercicio1;

public class Leon extends Felino {

    public Leon(int id, String especie, String tipo_comida, String habitat) {
        super(id, especie, tipo_comida, habitat);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Roooar");
    }
    
    @Override
    public void saltar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
