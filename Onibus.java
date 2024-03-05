public class Onibus extends Veiculo{

    private String motor;
    private String placa;
    private int quantidadeDePassageiros;

    public Onibus(int id, String motor, String placa, int quantidadeDePassageiros, double valorDeCompra) {
        super(id, valorDeCompra);
        this.motor = motor;
        this.placa = placa;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    public int getId() {
        return super.getId();
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuantidadeDePassageiros() {
        return quantidadeDePassageiros;
    }

    public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    public double getValorDeCompra() {
        return super.getValorDeCompra();
    }


    @Override
    public String toString() {
        return "Onibus{" +
                "id=" + getId() +
                ", motor='" + motor + '\'' +
                ", placa='" + placa + '\'' +
                ", quantidadeDePassageiros=" + quantidadeDePassageiros +
                ", valorDeCompra=" + getValorDeCompra() +
                '}';
    }

    @Override
    public double calcularDiaria() {
        return getValorDeCompra() / 25 + 100 * quantidadeDePassageiros;
    }
}
