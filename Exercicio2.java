import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        double num1, num2, num3, num4, result;
        double op1, op2, op3, op4;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número!"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número, meu consagrado!"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Ta meio repetitivo mas da mais um número!"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog("Fala o ultimo numero meu filho..."));

        op1 = num1 * num1;
        op2 = num2 * num2;
        op3 = num3 * num3;
        op4 = num4 * num4;
        result = op1 + op2 + op3 + op4;

        String s = String.format(
            "Seu primeiro número ao quadrado é igual a %.2f, seu segundo número ao quadrado é %.2f, \nseu terceiro ao quadrado é igual %.2f e finalmente seu ultimo número ao quadrado é igual a %.2f e a soma entre todos é igual a %.2f.",
            op1, op2, op3, op4, result
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
