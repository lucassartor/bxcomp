import java.util.Scanner;

class Tarefas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = Integer.parseInt(sc.nextLine());

        String[] frases = new String[testes];

        for (int i = 0; i < testes; i++) {
            frases[i] = sc.nextLine();
        }

        sc.close();

        for (int i = 0; i < testes; i++) {

            if (frases[i].contains("7"))
                System.out.println("Eu capturei o touro de Creta");

            else if (frases[i].contains("8"))
                System.out.println("Eu capturei os cavalos de Diomedes");

            else if (frases[i].contains("9"))
                System.out.println("Eu obtive o cinto de Hipolita");

            else if (frases[i].contains("10"))
                System.out.println("Eu roubei os gados de Geriao");

            else if (frases[i].contains("11"))
                System.out.println("Eu consegui as macas de ouro");

            else if (frases[i].contains("12"))
                System.out.println("Eu capturei Cerberos");

            else
                System.out.println("Vai catar coquinho, seu besta fracote");

        }

    }
}