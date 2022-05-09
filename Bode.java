public class Bode implements Mamifero {
    private String som;
    private String nome;

    public Bode(String nome, String som){
        this.som = som;
        this.nome = nome;
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
