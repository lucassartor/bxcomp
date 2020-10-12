import java.util.Scanner;

class Encomenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testes = Integer.parseInt(sc.nextLine());

        String[] frases = new String[testes];
        Integer[] contDeus = new Integer[testes];
        Integer[] contMortal = new Integer[testes];

        for (int i = 0; i < testes; i++) {
            frases[i] = sc.nextLine();
            contDeus[i] = 0;
            contMortal[i] = 0;
        }

        for (int i = 0; i < testes; i++) {

            if (frases[i].toLowerCase().contains("akh"))
                contDeus[i]++;
            if (frases[i].toLowerCase().contains("sekhem")) {
                contDeus[i]++;
                contMortal[i]++;
            }
            if (frases[i].toLowerCase().contains("ren")) {
                contDeus[i]++;
                contMortal[i]++;
            }
            if (frases[i].toLowerCase().contains("ba")) {
                contMortal[i]++;
                contDeus[i]--;
            }
            if (frases[i].toLowerCase().contains("ka")) {
                contMortal[i]++;
                contDeus[i]--;
            }
            if (frases[i].toLowerCase().contains("khat"))
                contMortal[i]++;
            if (frases[i].toLowerCase().contains("sahu"))
                contMortal[i]++;
            if (frases[i].toLowerCase().contains("shwt"))
                contMortal[i]++;
            if (frases[i].toLowerCase().contains("ab"))
                contMortal[i]++;
        }


        for (int i = 0; i < testes; i++) {
            if (contDeus[i] == 3)
                System.out.println("Opa, ancestrais e deuses nao empacotam duas vezes.");
            else if (contMortal[i] == 8 && contDeus[i] < 1)
                System.out.println("Alma mortal pronta para ser empacotada.");
            else
                System.out.println("Tem e uma bagunca espiritual aqui!");
        }
        sc.close();
    }
}