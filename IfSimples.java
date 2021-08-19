import javax.swing.JOptionPane;
//convenção camel case: ConvencaoCamelCase
public class IfSimples{
    public static void main (String [] args){
        //cada primitivo tem uma classe empacotadora (wrapper) associada
        //byte: Byte
        //short: Short
        //int: Integer
        //long: Long
        //char: Character
        //float: Float
        //double: Double

        //System.out.println ("Hello, World");
        //float nota;
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
        if (nota >= 70)
            JOptionPane.showMessageDialog(null, "Aprovado");
    }    
}


