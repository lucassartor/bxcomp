import java.util.Scanner;

class Paradeiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = Integer.parseInt(sc.nextLine());

        String[] frases = new String[testes];
        String[] frasesArrumadas = new String[testes];

        for (int i = 0; i < testes; i++) {
            frases[i] = sc.nextLine();
        }

        sc.close();

        for (int i = 0; i < testes; i++) {
            frasesArrumadas[i] = new StringBuilder(frases[i]).reverse().toString();
        }

        for (int i = 0; i < frasesArrumadas.length; i++) {

            if((Character.getNumericValue(frasesArrumadas[i].charAt(0)) < 2
            &&  Character.getNumericValue(frasesArrumadas[i].charAt(4)) <= 3)){
                System.out.println(frasesArrumadas[i] + " " + "O solo estara ao nosso favor nesse dia.");
                break;
            }

            else if((Character.getNumericValue(frasesArrumadas[i].charAt(0)) >= 2 && Character.getNumericValue(frasesArrumadas[i].charAt(1)) >= 0
            && Character.getNumericValue(frasesArrumadas[i].charAt(3)) >= 0 && Character.getNumericValue(frasesArrumadas[i].charAt(4)) >= 3)
            || (Character.getNumericValue(frasesArrumadas[i].charAt(0)) <= 2 && Character.getNumericValue(frasesArrumadas[i].charAt(1)) <= 2
            && Character.getNumericValue(frasesArrumadas[i].charAt(3)) == 0 && Character.getNumericValue(frasesArrumadas[i].charAt(4)) <= 9)
            || (Character.getNumericValue(frasesArrumadas[i].charAt(0)) <= 2 && Character.getNumericValue(frasesArrumadas[i].charAt(1)) >= 2
            && Character.getNumericValue(frasesArrumadas[i].charAt(3)) == 0 && Character.getNumericValue(frasesArrumadas[i].charAt(4)) <= 9))
                System.out.println(frasesArrumadas[i] + " " + "O solo nao estara ao nosso favor nesse dia.");
            
            else
                System.out.println(frasesArrumadas[i] + " " + "O solo estara ao nosso favor nesse dia.");
        }
    }
}