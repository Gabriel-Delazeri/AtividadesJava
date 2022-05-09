public class Vaca implements Mamifero {
    private String som;
    private String nome;

    public Vaca(String nome, String som){
        this.nome = nome;
        this.som = som;
    }

    @Override
    public void emiteSom() {
        System.out.println(this.som);
    }  
     
    @Override
    public void setSom(String som)
    {
        this.som = som;
    } 
}
