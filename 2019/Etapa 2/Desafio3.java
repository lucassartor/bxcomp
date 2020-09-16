import java.util.Scanner;

class Desafio3 {

    public static Character[] converte(String[] binario) {

        String palavra = "";

        for (int i = 0; i < binario.length; i++) {
            int charCode = Integer.parseInt(binario[i], 2);
            String letra = new Character((char)charCode).toString();
            palavra += letra;
        }

        while(palavra.length()){

            palavra.replace(target, "")
        }


        return palavra;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] binario = new String[15];

        int aux = 0;

        while (true) {
            while (!sc.hasNextLine()) {
                binario[aux] = sc.nextLine().split(" ");
                aux++;
            }
            converte(binario);
        }

        sc.close();

    }
}