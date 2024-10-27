import javax.swing.JOptionPane;

public class contagem {
    public static void main(String[] args) {
        int contador = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para fazer a contagem: "));
        do {
            System.out.println(contador);
            contador--;

        } while (contador >= 0);

        System.out.println("Contagem finalizada");

    }
    
}
