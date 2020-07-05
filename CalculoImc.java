
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculoImc {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            String nome = JOptionPane.showInputDialog("Digite o seu nome;");
            JOptionPane.showMessageDialog(null, "O seu nome é: " + nome);
              
            String altura = JOptionPane.showInputDialog("Digite a sua altura:");
            JOptionPane.showMessageDialog(null, "O numero digitado foi: " + altura);
            double altconver = Double.parseDouble(altura);
            
            String peso = JOptionPane.showInputDialog("Digite o seu peso: ");
            JOptionPane.showMessageDialog(null, "Você pesa " + peso + " Kilos");
            int pesoconver = Integer.parseInt(peso);
            
            double IMC = pesoconver/(altconver*altconver);
            String IMCF = String.format("%.1f", IMC);
            JOptionPane.showMessageDialog(null, "Você se chama " + nome);
            JOptionPane.showMessageDialog(null, "O seu IMC é: " + IMCF);
            
    }
    
}
