import javax.swing.JOptionPane;
public class exercicio7 {  
    public static void main(String[] args) {
      
        int idade, op1, idade_dias;
        double idade_mes;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        op1 = idade * 365;
        idade_dias = op1;
        idade_mes = idade_dias / 30;

        String s =String.format(
            "Você tem %d anos ou seja você tem %d dias de idade!",
            idade, idade_dias
        );
        JOptionPane.showMessageDialog(null, s);
    } 
}
