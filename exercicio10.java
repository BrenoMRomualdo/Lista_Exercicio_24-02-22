import javax.swing.JOptionPane;
public class exercicio10 {
    public static void main(String[] args) {
        double Custo_carro, Custo_fabrica, porcent_distribuidor, imposto, op1, op2;

        Custo_fabrica = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o custo da manufatura do carro?"));
        porcent_distribuidor = 0.28;
        imposto = 0.45;
        op1 = Custo_fabrica * porcent_distribuidor;
        op2 = Custo_fabrica * imposto;
        Custo_carro = (Custo_fabrica + op1) + op2;

        String s = String.format(
            "O Custo de fabrica foi %.2f $, após as burocracias da vida o custo do seu carro fica: %.2f $",
            Custo_fabrica, Custo_carro
        );
        JOptionPane.showMessageDialog(null, s);

    }
    
}
