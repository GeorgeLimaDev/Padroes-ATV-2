public class Helicoptero extends Veiculo{

    private int quantidadeDeRotores;
    private double tempoDeVoo;

    public Helicoptero(int id, int quantidadeDeRotores, double tempoDeVoo, double valorDeCompra) {
        super(id, valorDeCompra);
        this.quantidadeDeRotores = quantidadeDeRotores;
        this.tempoDeVoo = tempoDeVoo;
    }

    public int getId() {
        return super.getId();
    }

    public int getQuantidadeDeRotores() {
        return quantidadeDeRotores;
    }

    public void setQuantidadeDeRotores(int quantidadeDeRotores) {
        this.quantidadeDeRotores = quantidadeDeRotores;
    }

    public double getTempoDeVoo() {
        return tempoDeVoo;
    }

    public void setTempoDeVoo(double tempoDeVoo) {
        this.tempoDeVoo = tempoDeVoo;
    }

    public double getValorDeCompra() {
        return super.getValorDeCompra();
    }

    @Override
    public String toString() {
        return "Helicoptero{" +
                "id=" + getId() +
                ", quantidadeDeRotores=" + quantidadeDeRotores +
                ", tempoDeVoo=" + tempoDeVoo +
                ", valorDeCompra=" + getValorDeCompra() +
                '}';
    }

    @Override
    public double calcularDiaria() {
        return getValorDeCompra() / 10 * quantidadeDeRotores;
    }
}
