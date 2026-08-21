package Ejercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Humano humano = new Humano("Jorge", 21, null);
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

        for (Animal ani : var.values()) {
            if (ani instanceof Perro) {
                perro.add((Perro) ani);
            }

        }
        
        Collections.sort(perro, Comparator.comparing(Perro::getEspecie));
        System.out.println("----Lista de perros ordenados----");

        for (Perro raza : perro) {
            raza.mostrarinf();
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese la raza del perro a buscar: ");
        String razaBuscada = sc.nextLine();

        boolean encontrado = false;
        Iterator<Perro> it = perro.iterator();
        while (it.hasNext()) {
            Perro actual = it.next();
            if (actual.getEspecie().equalsIgnoreCase(razaBuscada)) {
                it.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Perro de raza '" + razaBuscada + "' encontrado y eliminado.");
        } else {
            System.out.println("Perro de raza '" + razaBuscada + "' no se encuentra en la lista.");
        }

        for (Perro raza : perro) {
            raza.mostrarinf();
        }
        
        
        HashSet<Gato> gato = new HashSet<>();
        ArrayList<Animal> salvajes = new ArrayList<>();
        
        for (Animal anim : var.values()){
            if( anim instanceof Gato) {
                gato.add((Gato)anim);
            }else if (anim instanceof Tigre|| anim instanceof Leon || anim instanceof Lobo){
                salvajes.add(anim);
            }
        }
        System.out.println("----Lista de gato----");
        for(Gato g : gato){
            g.mostrarinf();
        }
        System.out.println("----Liista de animales salvajes----");
        for(Animal a : salvajes){
            a.mostrarinf();
        }
        
       
    }
    
}
