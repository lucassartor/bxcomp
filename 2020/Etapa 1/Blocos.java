import java.util.Scanner;

class Blocos {
  public static void main(String[] args) {
    int testes;
    int h;
    int cont = 0;

    Scanner sc = new Scanner(System.in);
    testes = sc.nextInt();

    for (int a = 0 ; a < testes ; a++)
    {

      h = sc.nextInt();
      cont = 0;
      for(int b = 0; b < h ; b++ ) 
      {
        cont = cont + b+1;

      }

      if (h < 2) System.out.println("Thoth seu doido isso nao eh uma piramide");
      else System.out.println("Sao necessarios " + cont + " blocos para a construcao");
    }

    sc.close();
  }
}