public class Test {
   
    public static void main(String[] args)
    {
        //GABRIEL DELAZERI CASTRO - RA: N7223A1 - TURMA:CC2P04

        // Instanciando objeto com construtor
        Cachorro Cachorro = new Cachorro("Cachorro", "Au Au Au");
        
        // Método de mudar o som emitido pelo animal...
        Cachorro.setSom("Arr Arr Arr");

        // Método de emitir o som...
        System.out.println("\n (1) Cachorro:");
        Cachorro.emiteSom();

        //outros 3 animais implementados através de suas classes derivadas da Abstract Mamifero.
        Porco Porco = new Porco("Porco", "Oinc-Oinc");
        System.out.println("\n (2) Porco:");
        Porco.emiteSom();

        Vaca Vaca = new Vaca("Vaca", "Muuuu");
        System.out.println("\n (3) Vaca:");
        Vaca.emiteSom();

        Bode Bode = new Bode("Bode", "Béééé");
        System.out.println("\n (4) Bode:");
        Bode.emiteSom();
    }
}
