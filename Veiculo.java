public abstract class Veiculo {
    
    public String modelo;
    public String ano;

    public Veiculo(String modelo, String ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public void fichaVeiculo()
    {
        System.out.println("\n" + this.modelo + "  " + this.ano);
    }

    public abstract void trocarPneu(Integer pneu);
    
}
