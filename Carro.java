public class Carro extends Veiculo{

    private double autonomia;
    private String motor;
    private String placa;

    public Carro(int id, double autonomia, String motor, String placa, double valorDeCompra) {
        super(id, valorDeCompra);
        this.autonomia = autonomia;
        this.motor = motor;
        this.placa = placa;
    }

    public int getId() {
        return super.getId();
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
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

    public double getValorDeCompra() {
        return super.getValorDeCompra();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + getId() +
                ", autonomia=" + autonomia +
                ", motor='" + motor + '\'' +
                ", placa='" + placa + '\'' +
                ", valorDeCompra=" + getValorDeCompra() +
                '}';
    }

    @Override
    public double calcularDiaria() {
        return getValorDeCompra() / 50;
    }
}
