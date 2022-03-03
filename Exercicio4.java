
import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main(String[] args) {
        int valor_inteiro, num_anterior, op1;

        valor_inteiro = Integer.parseInt(JOptionPane.showInputDialog("De um numero inteiro plz!"));
        op1 = valor_inteiro - 1;
        num_anterior = op1;

        String s = String.format(
            "Seu numero escolhido é %d e o antecessor é %d.",
            valor_inteiro, num_anterior
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
