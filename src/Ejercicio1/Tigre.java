package Ejercicio1;

public class Tigre extends Felino {

    public Tigre(int id, String tipo_comida, String habitat, double altura, double velocidad) {
        super(id, "Tigre", tipo_comida, habitat, altura, velocidad);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Grrrr...");
    }
    
    @Override
    public double saltar() {
        pedirVelocidadPorTeclado();
        double salto = (velocidad * 2) + 10;
        System.out.println(especie + " salta " + salto + " metros.");
        return salto;
    }
    
}
