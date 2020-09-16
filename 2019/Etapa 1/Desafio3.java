import java.util.Scanner;

class Desafio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = sc.nextInt();

        Integer[][] combustivelAtual = new Integer[5][testes];

        for (int i = 0; i < testes; i++) {
            for (int j = 0; j < combustivelAtual.length; j++) {
                combustivelAtual[j][i] = sc.nextInt();
            }
        }

        sc.close();
        
        for (int i = 0; i < testes; i++) {
            int testeAtual = i + 1; 
            System.out.print("Teste " + testeAtual +": ");

            for (int j = 0; j < combustivelAtual.length; j++) {
                System.out.print(300 - combustivelAtual[j][i] + " ");
            }
            System.out.println();
        }

        
    }
}