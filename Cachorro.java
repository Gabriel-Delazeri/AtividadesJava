public class Cachorro implements Mamifero {
    private String som;
    private String nome;

    public Cachorro(String nome, String som){
        this.nome = nome;
        this.som = som;
    }

    @Override
    public void emiteSom() {
        System.out.println(this.som);
    }   

    public void setSom(String som)
    {
        this.som = som;
    }
}
