import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
        byte idade = Byte.parseByte(JOptionPane.showInputDialog("Qual a sua idade?"));
        boolean podeDirigir;
        podeDirigir = idade >= 18;
        // if (idade >= 18) 
        //     podeDirigir = true;
        // else
        //     podeDirigir = false;

        String resultado;
        resultado = idade >= 18 ? "Sim, você pode dirigir" : "Não, ainda não";

        //Você pode dirigir
        //Você não pode dirigir
        System.out.printf ("Você %spode dirigir\n", idade >= 18 ? "" : "não ");
        resultado = String.format("Você %spode dirigir\n", idade >= 18 ? "" : "não ");
        JOptionPane.showMessageDialog(null, resultado);
    }   
}
