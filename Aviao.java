public class Aviao extends Veiculo{

    private double tempoVoo;
    private double velocidadeDeCruzeiro;

    public Aviao(int id, double tempoVoo, double valorDeCompra, double velocidadeDeCruzeiro) {
        super(id, valorDeCompra);
        this.tempoVoo = tempoVoo;
        this.velocidadeDeCruzeiro = velocidadeDeCruzeiro;
    }

    public int getId() {
        return super.getId();
    }

    public double getTempoVoo() {
        return tempoVoo;
    }

    public void setTempoVoo(double tempoVoo) {
        this.tempoVoo = tempoVoo;
    }

    public double getValorDeCompra() {
        return super.getValorDeCompra();
    }

    public double getVelocidadeDeCruzeiro() {
        return velocidadeDeCruzeiro;
    }

    public void setVelocidadeDeCruzeiro(double velocidadeDeCruzeiro) {
        this.velocidadeDeCruzeiro = velocidadeDeCruzeiro;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "id=" + getId() +
                ", tempoVoo=" + tempoVoo +
                ", valorDeCompra=" + getValorDeCompra() +
                ", velocidadeDeCruzeiro=" + velocidadeDeCruzeiro +
                '}';
    }

    @Override
    public double calcularDiaria() {
        return getValorDeCompra() / 5 + 1000 * velocidadeDeCruzeiro;
    }
}
