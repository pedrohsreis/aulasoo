package aula;

import PacoteCachorro.Gato;

/**
 *
 * @author ice
 */
public class Cachorro {
    
    private String cor;
    private int idade;
    private String porte;
    private Gato gato;
    
    public Cachorro(String cor, int idade){
        this.gato = new Gato();
        this.cor = cor;
        this.idade = idade;
    }
    public Cachorro(int idade, String porte){
        this.gato = new Gato();
        this.porte = porte;
        this.idade = idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPorte(String porte){
        this.porte = porte;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public String getPorte(){
        return porte;
    }
    public int getIdade(){
        return idade;
    }

    /**
     * @return the gato
     */
    public Gato getGato() {
        return gato;
    }

    /**
     * @param gato the gato to set
     */
    public void setGato(Gato gato) {
        this.gato = gato;
    }
    
}
