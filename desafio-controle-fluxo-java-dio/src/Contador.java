import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        //criando objeto scanner
        Scanner terminal  = new Scanner(System.in).useLocale(Locale.US);
        
        //recebendo o primeiro número
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal .nextInt();

        //recebendo o segundo número
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal .nextInt();
        terminal .close();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("\u001B[31m"+ e + "\u001B[0m");
        }

    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem ; i++) {
            System.out.println(i);
        }
    }
}
