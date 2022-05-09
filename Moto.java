public class Moto extends Veiculo{

    public Moto(String modelo, String ano) {
        super(modelo, ano);
    }

    public void trocarPneu(Integer pneu){
        if(pneu > 2){
            System.out.println("\n Você só pode trocar dois pneus");
        }
        if(pneu > 0 & pneu < 2){
            System.out.println("\n Pneu(s) trocados com sucesso");
        }
    }


    
}
