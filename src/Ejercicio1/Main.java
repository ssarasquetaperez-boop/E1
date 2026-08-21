package Ejercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Animal> var = new HashMap<>();
        int i = 0;
        var.putIfAbsent(i, new Tigre(i, "Carne", "Jungla", 1, 90));
        i++;
        var.putIfAbsent(i, new Leon(i, "Carne", "En la savana", 1, 80));
        i++;
        var.putIfAbsent(i, new Gato(i, "Alimento balanceado", "La calle", 0.25, 48));
        i++;
        var.putIfAbsent(i, new Lobo(i, "Blanco", "Carne", "La Montana"));
        i++;
        var.putIfAbsent(i, new Perro(i, "Chiwawa", "Alimento", "De casa"));
        i++;
        var.putIfAbsent(i, new Perro(i, "Pichichu", "Alimento", "La calle"));
        i++;
        var.putIfAbsent(i, new Perro(i, "Pequine", "Alimento", "De casa"));
        i++;
        
//        for (Animal a : var.values() ){
//            a.mostrarinf();
//        }
        
        ArrayList<Perro> perro = new ArrayList<>();
        
        
        for (Animal a : var.values() ){
            if(a instanceof Perro){
            perro.add((Perro)a);
            }
//            for(Perro p : perro){
                System.out.println(perro);
//            }
        }

    }
}
