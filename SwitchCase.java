import javax.swing.JOptionPane;
public class SwitchCase {
    static public void main(String outroNome []) {
        String conceito;
        conceito = JOptionPane.showInputDialog("Qual foi o seu conceito?");
        switch (conceito){
            
            case "A":
                JOptionPane.showMessageDialog(null, "Parabéns");
                //JOptionPane.showMessageDialog(null, "Excelente");
                //break;
            default:
                JOptionPane.showMessageDialog(null, "Conceito inválido");
               
            case "B":
                JOptionPane.showMessageDialog(null, "Excelente");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Bom");
                break;
            case "R":
                JOptionPane.showMessageDialog(null, "Vamos tentar novamente");
                break;
            
        }        
    }
}
