package Ejercicio1;

public class Leon extends Felino {

    public Leon(int id, String tipo_comida, String habitat, double altura, double velocidad) {
        super(id, "Leon", tipo_comida, habitat, altura, velocidad);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Roooar");
    }
    
    @Override
    public double saltar() {
        pedirVelocidadPorTeclado();
        double salto = (velocidad * 3) + 5;
        System.out.println(especie + " salta " + salto + " metros.");
        return salto;
    }
}
