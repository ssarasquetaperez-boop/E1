
package Ejercicio1;


public abstract class Felino extends Animal {
    protected double altura;
    protected double velocidad;

    public Felino(int id, String especie, String tipo_comida, String habitat, double altura, double velocidad) {
        super(id, especie, tipo_comida, habitat);
        this.altura = altura;
        this.velocidad = velocidad;
    }

    public double getAltura() {
        return altura;
    }

    public double getVelocidad() {
        return velocidad;
    }
    
    public void rugir(){
        System.out.println(especie + "ruge");
    }
    
    public abstract double saltar();
    
    protected double pedirVelocidadPorTeclado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double v = this.velocidad;
        
            System.out.print("Ingrese la velocidad de " + especie + " (numero): ");
            v = sc.nextDouble();
            this.velocidad = v;
        return this.velocidad;
    }
    
}
