public class LibraGPB extends Moeda{
    @Override
    public void info() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(" * Total em Libra - " + this.getValor() + " (GBP).");
        System.out.println("1 Libra Esterlina/GBP(540) ~= 6,83 Real/BRL(790)");
    }

    @Override
    public double converter() {
        double valorConvertido = this.getValor() * 6.83;
        return valorConvertido;
    }
}
// 1 Libra Esterlina/GBP (540) ~= 6,83 RealBRL/BRL (790)
