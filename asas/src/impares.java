import javax.swing.JOptionPane;

public class impares{
    public static void main(String[] args) {
        int totalNumeros = 0;
        int totalImpares = 0;
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));

                if (numero != 0) {
                    totalNumeros++;

                    if (numero % 2 != 0) {
                        totalImpares++;
                    }
                }

        } while (numero != 0); 
       
        JOptionPane.showMessageDialog(null, 
                "Você digitou " + totalNumeros + " números.\n" +
                "Desses, " + totalImpares + " eram ímpares.", 
                "Resultado", 
                JOptionPane.INFORMATION_MESSAGE);

    }
}
