import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int primeiroParametro = 0;
        int segundoParametro = 0;

        System.out.println("Informe um valor inteiro: ");
        primeiroParametro = scanner.nextInt();

        System.out.println("Informe outro valor inteiro: ");
        segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }finally{
            scanner.close();
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        
        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }

        int totalInteracoes = segundoParametro - primeiroParametro;
        
        for(int i=0; i<totalInteracoes;i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
