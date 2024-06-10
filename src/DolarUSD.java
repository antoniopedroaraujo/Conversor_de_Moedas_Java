public class DolarUSD extends Moeda{
    @Override
    public void info() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(" * Total em Dólar - " + this.getValor() + " (USD).");
        System.out.println("1 Dólar dos Estados Unidos/USD(220) ~= 5,36 Real/BRL (790)");
    }

    @Override
    public double converter() {
        double valorConvertido = this.getValor() * 5.36;
        return valorConvertido;
    }
}
// 1 Dólar dos Estados Unidos/USD (220) ~= 5,36 RealBRL/BRL (790)
