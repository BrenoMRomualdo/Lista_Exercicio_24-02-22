import javax.swing.JOptionPane;
public class exercicio11 {
    public static void main(String[] args) {
        double Salario_min, comissão_fix, porcent_a_mais, quant_carro1, preço_carro1;
        double quant_carro2, preço_carro2, quant_carro3, preço_carro3, salario_final;
        double op1, op2, op3, optotal, quant_total;

        Salario_min = 1212.00;
        comissão_fix = 0.003;
        porcent_a_mais = 0.005;
        preço_carro1 = 25000;
        preço_carro2 = 12500;
        preço_carro3 = 75000;
        JOptionPane.showMessageDialog(null, "Tabela de Preço \ncarro 1: 25000$ \ncarro 2: 12500$ \ncarro 3: 75000$");
        quant_carro1 = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros de tipo 1 ele vendeu?"));
        quant_carro2 = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros de tipo 2 ele vendeu?"));
        quant_carro3 = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros de tipo 3 ele vendeu?"));
        quant_total = quant_carro1+quant_carro2+quant_carro3;
        op1 = quant_carro1*preço_carro1;
        op2 = quant_carro2*preço_carro2;
        op3 = quant_carro3*preço_carro3;
        optotal = op1+op2+op3;
        salario_final = Salario_min+((quant_total*comissão_fix)+(optotal*porcent_a_mais));
        
        String s = String.format(
            "Esse funcionario vendeu %.0f carros tipo 1, %.0f carros tipo 2 e %.0f carros tipo 3 \nApós o calculo das burocracias da vida o salario dele de %.2f$ foi para %.2f$",
            quant_carro1, quant_carro2, quant_carro3, Salario_min, salario_final
        );
        JOptionPane.showMessageDialog(null, s);

    }
    
}
