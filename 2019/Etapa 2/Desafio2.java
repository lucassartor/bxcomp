import java.util.Scanner;


class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = Integer.parseInt(sc.nextLine());

        Integer[][] queijos = new Integer[4][testes]; // B:5 | R:10 | C:1 | G:3 
                                                      // R > B > G > C
        Integer[] pesos = new Integer[testes];

        for (int i = 0; i < testes ; i++) {
            for (int j = 0; j < 4; j++) {
                queijos[j][i] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = 0;
        }

        for (int i = 0; i < testes ; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        pesos[i] += queijos[j][i] * 5;
                        break;
                
                    case 1:
                        pesos[i] += queijos[j][i] * 10;
                        break;

                    case 2:
                        pesos[i] += queijos[j][i] * 1;
                        break;   
                        
                    case 3:
                        pesos[i] += queijos[j][i] * 3;
                        break;

                    default:
                        break;
                }
            }
        }

        for (int i = 0; i < testes; i++) {
            if(pesos[i] <= 200){
                for (int j = 0; j < 4; j++) {
                    switch (j) {
                        case 0:
                            System.out.print("B:" + queijos[j][i] + ", ");
                            break;
                
                        case 1:
                            System.out.print("R:" + queijos[j][i] + ", ");
                            break;

                        case 2:
                            System.out.print("C:" + queijos[j][i] + ", ");
                            break;   
                            
                        case 3:
                            System.out.print("G:" + queijos[j][i]);
                            break;
                        
                        default:
                            break;
                    }
                }
                System.out.println();
                System.out.println("Todos os pedacos foram pegos");
            } else{
                int[] queijosOrdem = {queijos[1][i], queijos[0][i], queijos[3][i], queijos[2][i]};
                int[] quantPedacos = new int[4];
                int[] pedacos = {10, 5, 3, 1};
                int soma = 0;
                
                for (int j = 0; j < 4; j++) {
                    int aux = 0;
                    while(soma + pedacos[j] <= 200 && aux + 1 <= queijosOrdem[i]){
                        soma += pedacos[i];
                        aux++;
                    }
                    quantPedacos[j] = aux;
                }

                System.out.println("B: " + quantPedacos[1] +
                        ", R: " + quantPedacos[0] +
                        ", C: " + quantPedacos[3] +
                        ", G: " + quantPedacos[2]);
                        System.out.println("Nao foi possivel pegar todos os pedacos");
            } 
        }
    
    }
}