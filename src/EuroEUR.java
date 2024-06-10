public class EuroEUR extends Moeda{
    @Override
    public void info() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(" * Total em EuroEUR - " + this.getValor() + " (EUR).");
        System.out.println("1 Euro/EUR(978) ~= 5,76 Real/BRL(790)");
    }

    @Override
    public double converter() {
        double valorConvertido = this.getValor() * 5.76;
        return valorConvertido;
    }
}
// 1 EuroEUR/EUR (978) ~= 5,76 RealBRL/BRL (790)
