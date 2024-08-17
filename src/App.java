
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();
        
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {

                while (true) { 
                    try {

                        System.out.println("Digite o primeiro parâmetro: ");
                        counter.setNumberOne(scanner.nextInt()); //Defini o primeiro número a partir do input no terminal
                        break;
                        
                    } catch (InputMismatchException e) {
                        
                        System.out.println("Erro: Você deve inserir um número inteiro válido.");
                        scanner.nextLine(); //Lipa o buffer do scanner
                    }
                }

                while (true) { 

                    try {
            
                        System.out.println("Digite o segundo parâmetro: ");
                        counter.setNumberTwo(scanner.nextInt());  //Defini o segundo número a partir do input no terminal
                        break;

                    } catch (InputMismatchException e) {
                        
                        System.out.println("Erro: Você deve inserir um número inteiro válido.");
                        scanner.nextLine(); //Lipa o buffer do scanner
                    }
                }
 
                try {
                
                    counter.count(counter.getNumberOne(), counter.getNumberTwo());
                    break;
                    
                } catch (ParametrosInvalidosException e) {
    
                    System.out.println("Exceção: " + e.getMessage());
                    scanner.nextLine(); //Lipa o buffer do scanner
    
                }
            }

            scanner.close();
        }

    }
}
