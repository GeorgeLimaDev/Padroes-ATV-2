import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> frota;

    public Frota() {
        frota = new ArrayList<Veiculo>();
    }

    public void adicionar(Veiculo veiculo) throws Exception{
        for (Veiculo v : frota) {
            if(veiculo.getId() == v.getId()) {
                throw new Exception("ID do veículo já cadastrado");
            }
        }
        frota.add(veiculo);
    }


    public int quantidadeDeVeiculosCadastrados() {
        return frota.size();
    }

    public ArrayList<Veiculo> listarPorTipo(Class<? extends Veiculo> tipo) {
        ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
        for (Veiculo v : frota) {
            if (v.getClass().equals(tipo)) {
                lista.add(v);
            }
        }
        return lista;
    }
    
    public Veiculo veiculoComDiariaMaisCara (){
        double valorMaximo = 0;
        Veiculo veiculo = null;
        for (Veiculo v : frota) {
            if (v.calcularDiaria() > valorMaximo) {
                valorMaximo = v.calcularDiaria();
                veiculo = v;
            }
        }
        return veiculo;
    }
}
