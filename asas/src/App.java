
        import java.util.Scanner;

        public class App {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Digite um número para ver a tabuada: ");
                int numero = scanner.nextInt();
        
                int i = 1; 
                
                System.out.println("Tabuada de " + numero + ":");
                
                while (i <= 10) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                    i++; 
                }
                
                scanner.close();
            }
        }
        