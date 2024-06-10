public class RealBRL extends Moeda{
    @Override
    public void info() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(" * Total em RealBRL - " + this.getValor() + " (BRL).");
        System.out.println("----------------------------------------------------------------------------------");
    }

    @Override
    public double converter() {
        return super.converter();
    }
}
// 1 RealBRL/BRL (790) = 1,00 RealBRL/BRL (790)
