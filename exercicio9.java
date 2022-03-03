import javax.swing.JOptionPane;
public class exercicio9 {
    public static void main(String[] args) {
        double Salario, porcent_ajuste, Op1, Op2, Novo_salario;
    
        Salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário mensal?"));
        porcent_ajuste = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de ajuste de seu Salário?"));
        Op1 = porcent_ajuste /100;
        Op2 = Salario * Op1;
        Novo_salario = Salario + Op2;
    
        String s = String.format(
            "O seu salário antigo era %.2f, após o ajuste seu salário é = %.2f!",
            Salario, Novo_salario);
            
        JOptionPane.showMessageDialog(null, s);
    }    
}