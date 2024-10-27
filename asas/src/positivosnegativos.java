import java.util.Scanner;

public class positivosnegativos {
   

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        
        System.out.print("Digite um número inteiro (número negativo para sair): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero; 

            
            System.out.print("Digite um número inteiro (número negativo para sair): ");
            numero = scanner.nextInt();
        }

       
        System.out.println("A soma dos números positivos é: " + soma);

       
        scanner.close();
    }
}

    


    

