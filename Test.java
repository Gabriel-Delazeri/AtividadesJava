public class Test {
    public static void main(String [] args){ 

        /* Todos veiculos devem ser instanciados com modelo e ano,
           definidos através do construtor veiculo, dados atributos
           super.
        */

        Carro Civic = new Carro("Honda Civic", "2022");
        Moto XJ6 = new Moto("Yamaha XJ6", "2017");

        /* Primeiro exemplo de polimorfismo implementado no metodo 
           trocar pneu, que varia do tipo de veiculo.
           Por exemplo: Motos podem trocar até dois pneus, enquanto
           carros podem trocar até quatro.
        */

        /* Se for informado uma quantidade invalida de pneus
           retornará um erro 
        */
        Civic.trocarPneu(6);
        
        Civic.trocarPneu(2);

        XJ6.trocarPneu(2);
    }
}
