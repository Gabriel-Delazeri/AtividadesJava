public class Carro extends Veiculo{

    public Carro(String modelo, String ano) {
        super(modelo, ano);
    }

    public void trocarPneu(Integer pneu){
        if(pneu > 4){
            System.out.println("\n Você só pode trocar quatro pneus");
        }
        if(pneu > 0 & pneu <= 4){
            System.out.println("\n" + pneu + " Pneu(s) trocados com sucesso");
        }
    }
    
}
