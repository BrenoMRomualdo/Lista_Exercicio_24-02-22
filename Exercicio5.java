import javax.swing.JOptionPane;
public class Exercicio5 {
    public static void main(String[] args) {
        double base, altura, op1, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do seu retângulo?"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("e agora qual é a altura do seu retângulo"));
        op1 = base * altura;
        area = op1;

        String s = String.format(
            "A area de seu retângulo de base %.2f e altura %.2f é igual a %.2f.",
            base, altura, area
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
