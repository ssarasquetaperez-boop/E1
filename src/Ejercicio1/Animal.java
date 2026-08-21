
package Ejercicio1;

public abstract class Animal{
    
    private int id;
    String especie;
    private String tipo_comida;
    private String habitat;

    public Animal(int id, String especie, String tipo_comida, String habitat) {
        this.id = id;
        this.especie = especie;
        this.tipo_comida = tipo_comida;
        this.habitat = habitat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
    public void hacerRuido(){

    }
    
    public void comer(){
        System.out.println(especie + " está comiendo " + tipo_comida);
    }
    
    public void dormir(){
        System.out.println("zzzzz " + especie + " dormida");
    }
    
    
}
