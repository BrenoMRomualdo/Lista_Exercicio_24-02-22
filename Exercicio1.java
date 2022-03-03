import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String[] X) {
        double dolar, cot_dolar, real;
        cot_dolar = 5.10;
        dolar = 1;
        real = dolar * cot_dolar;
        String s = String.format(
            "1 dólar é igual a %.2f reais.",
            real
        );
        JOptionPane.showMessageDialog(null, s);
    }  
}