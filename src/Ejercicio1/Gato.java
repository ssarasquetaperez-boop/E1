package Ejercicio1;

public class Gato extends Felino implements Domestico {

    public Gato(int id, String especie, String tipo_comida, String habitat) {
        super(id, especie, tipo_comida, habitat);
    }
    
    
    
    @Override
    public void vacunar(){
        
    }

    @Override
    public void saltar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


