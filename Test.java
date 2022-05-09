public class Test {
   
    public static void main(String[] args)
    {
        // Instanciando objeto com construtor
        Cachorro Cachorro = new Cachorro("Cachorro", "Au Au Au");
        
        // Método de mudar o som emitido pelo animal...
        Cachorro.setSom("Arr Arr Arr");

        // Método de emitir o som...
        System.out.println("\n (1) Cachorro:");
        Cachorro.emiteSom();

        //outros 3 animais implementados através da interface Mamifero.
        Porco Porco = new Porco("Porco", "Oinc-Oinc");
        System.out.println("\n (2) Porco:");
        Porco.emiteSom();

        Vaca Vaquinha = new Vaca("Vaquinha", "Muuuu");
        System.out.println("\n (3) Vaca:");
        Vaquinha.emiteSom();

        Bode Bode = new Bode("Bode", "Béééé");
        System.out.println("\n (4) Bode:");
        Bode.emiteSom();




    }
}
