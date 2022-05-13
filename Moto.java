public class Moto extends Veiculo{

    public Moto(String modelo, String ano) {
        super(modelo, ano);
    }
    
    @Override 
    public void trocarPneu(Integer pneu){
        if(pneu > 2){
            System.out.println("\n Você só pode trocar dois pneus");
        }
        if(pneu > 0 & pneu <= 2){
            System.out.println("\n" + pneu + " Pneu(s) trocados com sucesso");
        }
    }


    
}
