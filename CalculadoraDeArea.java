import java.util.Scanner;

// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

public class CalculadoraDeArea {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma das opções: " +
                    "\n 1 - Calcular a área do círculo" +
                    "\n 2 - Calcular a área do quadrado" +
                    "\n 3- Sair!");
            Scanner calculo = new Scanner(System.in);
            int escolhaCalculo = calculo.nextInt();

            switch (escolhaCalculo) {
                case 1:
                    System.out.println("Vamos calcular a área do círculo");
                    Scanner circulo = new Scanner(System.in);
                    System.out.println("Qual o comprimento do raio do círculo que você deseja saber a área em cm?");
                    double raioCirculo = circulo.nextDouble();

                    double areaCirculo = Math.PI * (raioCirculo * raioCirculo);
                    System.out.println("A área do círculo é " + areaCirculo + " cm²");
                    break;

                case 2:
                    System.out.println("Vamos calcular a área do quadrado");
                    Scanner quadrado = new Scanner(System.in);
                    System.out.println("Qual o comprimento de um lado do quadrado, que você deseja saber a área, em cm?");
                    double ladoQuadrado = quadrado.nextDouble();

                    double areaQuadrado = (ladoQuadrado * ladoQuadrado);
                    System.out.println("A área do quadrado é " + areaQuadrado + " cm²");
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Número invalido");
                    break;
            }
            if (escolhaCalculo != 1 ||escolhaCalculo != 2 || escolhaCalculo != 3) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
    }
}
