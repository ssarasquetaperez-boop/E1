package Ejercicio1;

import java.util.*;

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
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione una vacuna");
        System.out.println("1-Sarna");
        System.out.println("2-Cancha");
        System.out.println("3-Parácito");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println("Se curo de sarna");
                break;
            case 2: 
                System.out.println("Se curo de cancha");
                break;
            case 3:
                System.out.println("Se curo de parácitos");
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
                
                
    }
    
    @Override
    public double saltar() {
        pedirVelocidadPorTeclado();
        double salto = altura + velocidad + 1;
        System.out.println(especie + " salta " + salto + " metros.");
        return salto;
    }
}


