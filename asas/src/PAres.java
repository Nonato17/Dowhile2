import java.util.Scanner;

public class PAres {
    public static void main(String[] args) {
       
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();

      
        if (N > 0) {
            System.out.println("Números pares de 1 até " + N + ":");
            
            
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); 
        } else {
            System.out.println("Por favor, insira um número positivo.");
        }

      
        scanner.close();
    }
}

