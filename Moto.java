public class Moto extends Veiculo{

    private String motor;
    private String placa;
    private String sistemaDePartida;

    public Moto(int id, String motor, String placa, String sistemaDePartida, double valorDeCompra) {
        super(id, valorDeCompra);
        this.motor = motor;
        this.placa = placa;
        this.sistemaDePartida = sistemaDePartida;
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

    public String getSistemaDePartida() {
        return sistemaDePartida;
    }

    public void setSistemaDePartida(String sistemaDePartida) {
        this.sistemaDePartida = sistemaDePartida;
    }

    public double getValorDeCompra() {
        return super.getValorDeCompra();
    }

    @Override
    public String toString() {
        return "Moto{" +
                "id=" + getId() +
                ", motor='" + motor + '\'' +
                ", placa='" + placa + '\'' +
                ", sistemaDePartida='" + sistemaDePartida + '\'' +
                ", valorDeCompra=" + getValorDeCompra() +
                '}';
    }

    @Override
    public double calcularDiaria() {
        if (sistemaDePartida.equals("Eletrico")) {
            return getValorDeCompra() / 50 + 20;
        }
        else if (sistemaDePartida.equals("Manual")) {
            return getValorDeCompra() / 50 + 5;
        }
        else return 0;
    }
}
