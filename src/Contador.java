import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("digite o primeiro parametro: ");
        int primeiro = terminal.nextInt();
        System.out.println("digite o segundo parametro: ");
        int segundo = terminal.nextInt();

        try {
            contar(primeiro, segundo);

        } catch (ParametrosInvalidosException e) {
            System.out.println("segundo parametro deve ser maior q o primeiro!!!");
        }
    }
                static void contar(int primeiro, int segundo) throws ParametrosInvalidosException{
                    if (primeiro <= segundo) {
                            throw new ParametrosInvalidosException();
                    }
                    else {
                        int contagem = primeiro - segundo;
                        for (int i = 1; i <= contagem; i++) {

                            System.out.println("imprimindo o numero " + i);
                        }
                    }
        }
}