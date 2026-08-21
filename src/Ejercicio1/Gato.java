package Ejercicio1;

public class Gato extends Felino implements Domestico {

    public Gato(int id, String tipo_comida, String habitat, double altura, double velocidad) {
        super(id, "Gato", tipo_comida, habitat, altura, velocidad);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Miauu");
    }
    
    @Override
    public void vacunar(){
        
    }
    
    @Override
    public double saltar() {
        pedirVelocidadPorTeclado();
        double salto = altura + velocidad + 1;
        System.out.println(especie + " salta " + salto + " metros.");
        return salto;
    }
}


