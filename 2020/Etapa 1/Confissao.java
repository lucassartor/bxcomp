import java.util.Scanner;


public class Confissao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = Integer.parseInt(sc.nextLine());

        String[] confissoes = new String[testes];

        for (int i = 0; i < testes; i++) {
            confissoes[i] = sc.nextLine();
        }
        sc.close();

        Integer[] mentiras = new Integer[testes];

        for (int i = 0; i < testes; i++) {
            mentiras[i] = 0;
        }

        for (int i = 0; i < testes; i++) {

            if((confissoes[i].contains("030")) && (confissoes[i].contains("051")))
                mentiras[i]++;
            
            else if((confissoes[i].contains("030") ) && (confissoes[i].contains("071") ))
                mentiras[i]++;

            else if((confissoes[i].contains("030") ) && (confissoes[i].contains("391") ))
                mentiras[i]++;

           /* else if((confissoes[i].contains("031") ) && (confissoes[i].contains("050") )){
                mentiras[i]++;
                if((confissoes[i].contains("031") ) && (confissoes[i].contains("391") )){
                    mentiras[i]--;
                }
                else if((confissoes[i].contains("031") ) && (confissoes[i].contains("071") )){
                    mentiras[i]--;
                }
            }

            else if((confissoes[i].contains("031") ) && (confissoes[i].contains("070") )){
                mentiras[i]++;
                if((confissoes[i].contains("031") ) && (confissoes[i].contains("051") )){
                    mentiras[i]--;
                }
                else if((confissoes[i].contains("031") ) && (confissoes[i].contains("391") )){
                    mentiras[i]--;
                }
            }

            else if((confissoes[i].contains("031") ) && (confissoes[i].contains("390") )){
                mentiras[i]++;
                if((confissoes[i].contains("031") ) && (confissoes[i].contains("051") )){
                    mentiras[i]--;
                }
                else if((confissoes[i].contains("031") ) && (confissoes[i].contains("071") )){
                    mentiras[i]--;
                }
            }*/


            else if((confissoes[i].contains("280") ) && (confissoes[i].contains("141") ))
                mentiras[i]++;

            else if((confissoes[i].contains("280") ) && (confissoes[i].contains("041") ))
                mentiras[i]++;
            
            else if((confissoes[i].contains("281") ) && ((confissoes[i].contains("140") ) || (confissoes[i].contains("040") )))
                mentiras[i]++;

            else if((confissoes[i].contains("281") ) && (confissoes[i].contains("040") ))
                mentiras[i]++;
        }

        for (int i = 0; i < testes; i++) {
            if(confissoes[i].contains("031 041 051 071 141 281 391") )
                    System.out.println("Amado que vida foi essa?");
            else {
                if(mentiras[i] <= 0)
                    System.out.println("Otimo, pode prosseguir para a balanca");
                        
                else if(mentiras[i] >= 1)
                    System.out.println("Parabens, o Ammit lhe espera");
            }
        }

    }
}