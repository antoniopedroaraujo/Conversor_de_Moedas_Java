abstract public class Moeda {

    protected double valor;

    public void info() {

    }

    public double converter() {
        return this.getValor();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
