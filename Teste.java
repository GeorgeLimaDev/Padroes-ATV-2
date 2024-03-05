import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(1, 100, 10000, 300);
        Carro carro = new Carro(2, 300, "1.4", "ABC1234", 10000);
        Helicoptero helicoptero = new Helicoptero(3, 2, 100, 10000);
        Moto moto = new Moto(4, "250CC", "ABC1234","Eletrico", 10000);
        Onibus onibus = new Onibus(5, "2.6", "ABC1234", 60, 10000);
        Frota frota = new Frota();

        try {
            frota.adicionar(aviao);
            frota.adicionar(carro);
            frota.adicionar(helicoptero);
            frota.adicionar(moto);
            frota.adicionar(onibus);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar veículo: " + e.getMessage());
        }
        System.out.println(frota.quantidadeDeVeiculosCadastrados());
        System.out.println(frota.veiculoComDiariaMaisCara());
        System.out.println(frota.listarPorTipo(Moto.class));
    }
}
