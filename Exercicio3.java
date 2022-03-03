import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String[] args) {
        double porcent_comissao, comissao, preço_peça, quantidade_peça, total;

        porcent_comissao = 0.05;
        preço_peça = 12.50;
        quantidade_peça = Double.parseDouble(JOptionPane.showInputDialog("quantas peças você quer comprar?"));
        total = quantidade_peça * preço_peça;
        comissao = total * porcent_comissao;
        
        String s = String.format(
            "O total da compra foi %.2f ou seja a comissão ficou %.2f.",
            total, comissao
            );
        JOptionPane.showMessageDialog(null, s);
    }
}
