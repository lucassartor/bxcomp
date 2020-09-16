import java.util.Scanner;

class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = Integer.parseInt(sc.nextLine());

        String[] frasesCorrompidas = new String[testes];

        for (int i = 0; i < testes ; i++) {
            frasesCorrompidas[i] = sc.nextLine();
        }

        sc.close();

        for (int i = 0; i < testes; i++) {
            char[] frases = frasesCorrompidas[i].toCharArray();
            boolean flag = false;
            
            for (int j = 0; j < frases.length; j++) {
                if(frases[j] == '!' && flag){
                    flag = false;
                }
                else if(frases[j] == '!' && !flag){
                    j++;
                    System.out.print(frases[j]);
                    flag = true; 
                }
                else if(flag){
                    System.out.print(frases[j]);
                }    
            }
            System.out.println(); 
        }
    }
}