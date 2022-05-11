public abstract class Mamifero {
    public String nome, som;
    
    public Mamifero(String som, String nome){
        this.som = som;
        this.nome = nome;
    }
    
    public void emiteSom() {
        System.out.println(this.som);
    }     

    public void setSom(String som){
        this.som = som;
    };
}
