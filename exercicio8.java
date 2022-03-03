import javax.swing.JOptionPane;
public class exercicio8 {
    public static void main(String[] args) {
        int eleitores, votos_branco, votos_nulos, op1, op2;
        int porcent_1, porcent_2, porcent_3, votos_validos;

        eleitores = Integer.parseInt(JOptionPane.showInputDialog("Quantos eleitores tem nesse municipio?"));
        votos_branco = Integer.parseInt(JOptionPane.showInputDialog("Desses eleitores quantos votaram em branco?"));
        op1 = eleitores - votos_branco;
        votos_nulos = Integer.parseInt(JOptionPane.showInputDialog("Desses eleitores restantes, quantos votaram nulo?"));
        op2 = op1 - votos_nulos;
        votos_validos = eleitores - op2;
        porcent_1 = (votos_branco * 100)/eleitores;
        porcent_2 = (votos_nulos * 100)/eleitores;
        porcent_3 = (votos_validos *100)/eleitores; 
        
        String s = String.format(
            "Neste municipio tem %f eleitores, desses eleitores %f votaram branco, ou seja %f%,\n %f votaram nulo, ou seja %f%, \n e sómente %f ou seja %f% tiveram seus votos validados!",
            eleitores, votos_branco, porcent_1, votos_nulos, porcent_2, votos_validos, porcent_3
        );
        JOptionPane.showMessageDialog(null, s);
    }    
}
