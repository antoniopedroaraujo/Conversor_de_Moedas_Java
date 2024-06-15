import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Scanner;

public class Main implements Menu {

    static Moeda dolar = new DolarUSD();

    static Moeda euro = new EuroEUR();

    static Moeda libra = new LibraGPB();

    static Moeda real = new RealBRL();

    static Moeda[] Cofrinho = {dolar,euro,libra,real};


    public static void adicionar (int moeda, double deposito) {
        try {
            Cofrinho[moeda].setValor(Cofrinho[moeda].getValor() + deposito);
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println(" - Depósito no valor de " + deposito + " realizado com sucesso!");
            System.out.println("----------------------------------------------------------------------------------");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println(" Índice de moeda não encontrado. Insira um número válido e tente novamente.");
        }
    }

    public static void remover (int moeda, double saque) {
        try {
            if (saque > Cofrinho[moeda].getValor()) {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println(" - [ERRO] : Não há dinheiro suficiente para o saque!");
                System.out.println("----------------------------------------------------------------------------------");
            } else {
                Cofrinho[moeda].setValor(Cofrinho[moeda].getValor() - saque);
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println(" - Saque no valor de " + saque + " realizado com sucesso!");
                System.out.println("----------------------------------------------------------------------------------");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println(" Índice de moeda não encontrado. Insira um número válido e tente novamente.");
        }
    }

    public static void listarMoedas() {
        for (Moeda moeda : Cofrinho) {
            moeda.info();
        }
    }

    public static void totalConvertido () {
        Double total = (double) 0;
        for (Moeda moeda : Cofrinho) {
            total = moeda.converter() + total;
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("- O valor total das moedas convertidas em Real(BRL) é de : R$ " + total.intValue() + ".00.");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.black,3,true);

        JLabel label = new JLabel();
        label.setText("COFRINHO DE MOEDAS");
        ImageIcon image = new ImageIcon("src/logo.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.black);
        label.setFont(new Font("Arial Black",Font.BOLD,60));
        label.setIconTextGap(25);
        label.setBackground(Color.gray);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        GUIFrame frame = new GUIFrame();
        frame.add(label);

        Scanner teclado = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0){
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println(" COFRINHO DE CONVERSÃO DE MOEDAS\n");
            System.out.println("  |1| - Adicionar depósito");
            System.out.println("  |2| - Realizar saque");
            System.out.println("  |3| - Listar todas as moedas");
            System.out.println("  |4| - Converter total em Reais");
            System.out.println("  |0| - Sair do programa");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println(" SELECIONE UMA OPÇÃO :");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println(" Selecione qual tipo de moeda será depositada:");
                System.out.println(" |0|-Dolar |1|-Euro |2|-Libra |3|-Real");
                System.out.println(" Em seguida, infome o valor do depósito.");
                adicionar(teclado.nextInt(),
                        teclado.nextDouble());
            } else if (opcao == 2) {
                System.out.println(" Selecione qual tipo de moeda será retirada:");
                System.out.println(" |0|-Dolar |1|-Euro |2|-Libra |3|-Real");
                System.out.println(" Em seguida, infome o valor do saque.");
                remover(teclado.nextInt(),
                        teclado.nextDouble());
            } else if (opcao == 3) {
                listarMoedas();
            } else if (opcao == 4) {
                totalConvertido();
            } else if (opcao == 0){
                break;
            } else {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println(" - Opção não encontrada, tente novamente!");
            }
        }
        System.out.println("========== FIM DO PROGRAMA ==========");
        System.out.println("Feche a janela para sair");
    }
}