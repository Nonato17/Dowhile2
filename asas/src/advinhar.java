import java.util.Scanner;

public class advinhar {
    public static void main(String[] args) {
        
        int numeroSecreto = 65; 
        int palpite;
        int tentativas = 0;

     
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Adivinhe o número entre 1 e 100: ");
        palpite = scanner.nextInt();
        tentativas++;

       
        while (palpite != numeroSecreto) {
            if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            }

            System.out.print("Adivinhe o número entre 1 e 100: ");
            palpite = scanner.nextInt();
            tentativas++;
        }

       
        System.out.println("Você acertou! O número era " + numeroSecreto + ".");
        System.out.println("Você fez " + tentativas + " tentativas.");

      
        scanner.close();
    }
}
