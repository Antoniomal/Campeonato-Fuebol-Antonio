package condicional;

import java.util.Scanner;

public class futebol {
    public static void main(String[] args) {
        final int qtdeTimes = 5;
        final int qtdeJogadores = 11;

        int qtdeMenor18 = 0;
        int qtdeAcima80Kg = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= qtdeTimes; i++) {
            float mediaIdade = 0;
            float mediaAltura = 0;
            int contMediaIdade = 0;
            int contMediaAltura = 0;

            for (int j = 1; j <= qtdeJogadores; j++) {
                System.out.println("Informe a idade do jogador: ");
                int idade = sc.nextInt();
                System.out.println("Informe a altura do jogador: ");
                double altura = sc.nextDouble();
                System.out.println("Informe o peso do jogador: ");
                double peso = sc.nextDouble();

                if (idade < 18) {
                    qtdeMenor18++;
                }
                if (peso > 80) {
                    qtdeAcima80Kg++;
                }

                mediaIdade += idade;
                contMediaIdade++;
                mediaAltura += altura;
                contMediaAltura++;
            }

            System.out.printf("A média de idade do time %d é %.2f\n", i, mediaIdade / contMediaIdade);
            System.out.printf("A altura média do time %d é %.2f\n", i, mediaAltura / contMediaAltura);
        }

        System.out.printf("O campeonato apresenta %d jogadores menores que 18 anos\n", qtdeMenor18);
        System.out.printf("O campeonato apresenta %d jogadores acima de 80 Kg\n", qtdeAcima80Kg);

        sc.close();
    }
}
